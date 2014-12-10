/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Bean.CasualUserInfoBean;
import Bean.LoginBean;
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
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author David
 */
public class CasualUserRegisterHandler implements IHandler {

    HttpServletRequest httpRequest;

    @Override
    public List<String> parse(HttpServletRequest request) {
        httpRequest = request;
        List<String> parseData = new ArrayList<String>();

        try {
            parseData.add(request.getParameterValues("name")[0]);
            parseData.add(request.getParameterValues("first_name")[0]);
            parseData.add(request.getParameterValues("last_name")[0]);
            parseData.add(request.getParameterValues("email")[0]);
            parseData.add(request.getParameterValues("pass")[0]);
            parseData.add(request.getParameterValues("birthday")[0]);
            parseData.add(request.getParameterValues("gender")[0]);
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
        String query1 = "Insert into mydb.user_casual "
                + "(id_user_casual, user_name, first_name, last_name, "
                + "email_addr, password, birthday, gender) \n"
                + "select count(id_user_casual) + 1, ?, ?, ?, "
                + "?, ?, ?, ? from mydb.user_casual;";

        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("Env located successfully");
            conn = ds.getConnection();
            System.out.println("DataSource Connection success");

            //info = lookupLoginBeanBean(httpRequest);
            //Check in businesses
            prpStmt = conn.prepareStatement(query1);
            prpStmt.setString(1, data.get(0)); //user_name
            prpStmt.setString(2, data.get(1)); //first_name
            prpStmt.setString(3, data.get(2)); //last_name
            prpStmt.setString(4, data.get(3)); //email_addr
            prpStmt.setString(5, data.get(4)); //password
            prpStmt.setString(6, data.get(5)); //birthday
            if (data.get(6).equalsIgnoreCase("m")) {
                prpStmt.setString(7, "2"); //gender
            } else {
                prpStmt.setString(7, "1"); //gender
            }
            int wtv = prpStmt.executeUpdate();
            System.out.println("Affected rows: " + wtv);

            HttpSession hs = httpRequest.getSession();
            CasualUserInfoBean cuser = (CasualUserInfoBean) lookupCasualBean(httpRequest);
            LoginBean lb = (LoginBean) lookupLoginBeanBean(httpRequest);
            cuser.setSet(true);
            lb.setValid(true);

            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For Registering");
        } catch (NullPointerException e) {
            System.out.println("Casual User Register Fail");
        } catch (NamingException ex) {
            Logger.getLogger(CasualUserRegisterHandler.class.getName()).log(Level.SEVERE, null, ex);
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
            /*
             if (!info.isValid()) {
             System.out.println("Authentication Failed. . .");
             }
             */
        }
    }

    private LoginBean lookupLoginBeanBean(HttpServletRequest request) {
        HttpSession httpSession = request.getSession(true);
        LoginBean loginbean = (LoginBean) httpSession.getAttribute("info");
        if (loginbean == null) {
            loginbean = new LoginBean();
            httpSession.setAttribute("info", loginbean);
        }
        return loginbean;
    }

    private CasualUserInfoBean lookupCasualBean(HttpServletRequest request) {
        HttpSession httpSession = request.getSession(true);
        CasualUserInfoBean cuser = (CasualUserInfoBean) httpSession.getAttribute("cuser");
        if (cuser == null) {
            System.out.println("cuser null at loginHandler");
            cuser = new CasualUserInfoBean();
            httpSession.setAttribute("cuser", cuser);
        }
        return cuser;
    }
}
