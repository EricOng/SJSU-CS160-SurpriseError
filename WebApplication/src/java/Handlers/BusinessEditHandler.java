/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Bean.BusinessUserInfoBean;
import java.sql.*;
import javax.sql.DataSource;
import java.util.*;
import javax.naming.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ROB
 */
public class BusinessEditHandler implements IHandler{
    BusinessUserInfoBean buser = new BusinessUserInfoBean();
    HttpServletRequest httpRequest;

    public List<String> parse(HttpServletRequest request) {
        httpRequest = request;
        
        System.out.println("At edit parser");
        List<String> data = new ArrayList<String>();
        HttpSession hs = request.getSession();
        BusinessUserInfoBean buser = (BusinessUserInfoBean) hs.getAttribute("buser");
        data.add(request.getParameterValues("name")[0]);
        data.add(request.getParameterValues("email")[0]);
 
        return data;
    }

    public void query(List<String> data) {
        Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prpStmt = null;
        buser = lookupBusinessBean(httpRequest);
        
        String query1 = "update mydb.user_business " 
                + "set business_name = ?, email_addr = ? "
                + "where user_name = " + buser.getUsername()+ ";";
                

        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("Env located successfully");
            conn = ds.getConnection();
            System.out.println("DataSource Connection success");

            prpStmt = conn.prepareStatement(query1);
            prpStmt.setString(1, data.get(0)); //first_name
            prpStmt.setString(2, data.get(1)); //email_addr
            
            int a = prpStmt.executeUpdate();
            buser.setBusinessName(data.get(0));
            buser.setEmail(data.get(1));
            httpRequest.getSession().setAttribute("buser", buser);
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For Updating User Information");
        } catch (NamingException ex) {
            Logger.getLogger(CasualEditHandler.class.getName()).log(Level.SEVERE, null, ex);
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
        }
    }
    private BusinessUserInfoBean lookupBusinessBean(HttpServletRequest request) {
        HttpSession httpSession = request.getSession(true);
        BusinessUserInfoBean buser = (BusinessUserInfoBean) httpSession.getAttribute("buser");
        if(buser == null){
            System.out.println("buser null at loginHandler");
            buser = new BusinessUserInfoBean();
            httpSession.setAttribute("buser", buser);
        }
        return buser;
    }
}
