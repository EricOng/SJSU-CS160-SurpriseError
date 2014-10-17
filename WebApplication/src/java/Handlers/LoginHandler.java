/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import Bean.LoginBean;
import Servlets.AddOfferFormServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

/**
 *
 * @author Eric Ong
 */
public class LoginHandler implements IHandler {
    LoginBean loginBean = lookupLoginBeanBean();

    @Override
    public List<String> parse(HttpServletRequest request) {
        List<String> parseData = new ArrayList<String>();
        //Parse only the first value from each Field of the AddOfferForm
        try {
            parseData.add(request.getParameterValues("User")[0]);
            parseData.add(request.getParameterValues("Pass")[0]);
        } catch (NullPointerException e) {
        } catch (IndexOutOfBoundsException e) {
        };
        return parseData;
    }

    @Override
    public void query(List<String> data) {
        Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prpStmt = null;
        LoginBean info = null;
        String query = "Select id_user_business, user_name, password from mydb.user_business"
                + " where user_name = ? and password = ?;";
        
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("DataSource Connection success");
            conn = ds.getConnection();
            
            info = lookupLoginBeanBean();
            
            prpStmt = conn.prepareStatement(query);

            prpStmt.setString(1, data.get(0)); //user_name
            prpStmt.setString(2, data.get(1)); //password

            rs = prpStmt.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equalsIgnoreCase(data.get(0))) { //check username
                    if (rs.getString(3).equalsIgnoreCase(data.get(1))) { //check password
                        info.setValid(true); //remember valid
                        info.setId(rs.getInt(1)); //remember id
                        System.out.println("Authentication Successful!");
                        break;
                    }
                }
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For Login Authentication");
        } catch (NamingException e) {
            Logger.getLogger(AddOfferFormServlet.class.getName()).log(Level.SEVERE, null, e);
        } catch (NullPointerException e) {
            System.out.println("No login information");
        } finally {
            // Always make sure result sets and statements are closed,
            // and the connection is returned to the pool
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {;
                }
                rs = null;
            }
            if (prpStmt != null) {
                try {
                    prpStmt.close();
                } catch (SQLException e) {;
                }
                prpStmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {;
                }
                conn = null;
            }
            if (!info.isValid()) {
                System.out.println("Authentication Failed. . .");
            }
        }
    }

    private LoginBean lookupLoginBeanBean() {
        try {
            Context c = new InitialContext();
            return (LoginBean) c.lookup("java:comp/env/WebApplication/Bean.LoginBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            System.err.println("Not sure how to bind the bean, initializing new LoginBean"); 
            return new LoginBean();
        }
    }
}
