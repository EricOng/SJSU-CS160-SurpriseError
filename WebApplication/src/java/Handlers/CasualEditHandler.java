/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Bean.CasualUserInfoBean;
import java.sql.*;
import javax.sql.DataSource;
import java.util.*;
import javax.naming.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 *
 * @author ROB
 */
public class CasualEditHandler {
    
    HttpServletRequest httpRequest;

    public CasualUserInfoBean parse(HttpServletRequest request) {
        
        CasualUserInfoBean bean = new CasualUserInfoBean();

        bean.setUserID(Objects.requireNonNull(request.getParameter("id_user_casual")));
        bean.setFName(Objects.requireNonNull(request.getParameter("name")));
        bean.setPassword(Objects.requireNonNull(request.getParameter("password")));
        bean.setEmail(Objects.requireNonNull(request.getParameter("email")));
        bean.setGender(Objects.requireNonNull(request.getParameter("gender")));
        bean.setBirthday(Objects.requireNonNull(request.getParameter("birthday")));
 
        return bean;
    }

    public void query(CasualUserInfoBean bean) throws NamingException {
        Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prpStmt = null;
        String query1 = "INSERT INTO mydb.user_casual "
                + "(user_name, first_name, last_name, email_addr, password, birthday) \n"
                + "VALUES (?, ?, ?, ?, ?, ?) WHERE id_user_casual = " + bean.getUserID() + ";";

        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("Env located successfully");
            conn = ds.getConnection();
            System.out.println("DataSource Connection success");

            prpStmt = conn.prepareStatement(query1);
            prpStmt.setString(1, bean.getUserName()); //user_name
            prpStmt.setString(2, bean.getFName()); //first_name
            prpStmt.setString(3, bean.getLName()); //last_name
            prpStmt.setString(4, bean.getEmail()); //email_addr
            prpStmt.setString(5, bean.getPassword()); //password
            prpStmt.setString(6, bean.getBirthday()); //birthday
            
            prpStmt.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For Updating User Information");
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
    
}
