/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Bean.BusinessUserInfoBean;
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
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author David
 */
public class BusinessUserRegisterHandler implements IHandler {
    
    HttpServletRequest httpRequest;

    @Override
    public List<String> parse(HttpServletRequest request) {
        httpRequest = request;
        List<String> parseData = new ArrayList<String>();

        try {
            parseData.add(request.getParameterValues("b_name")[0]);
            parseData.add(request.getParameterValues("b_pass")[0]);
            parseData.add(request.getParameterValues("b_business_name")[0]);
            parseData.add(request.getParameterValues("b_email_addr")[0]);
            parseData.add(request.getParameterValues("b_bussiness_type")[0]);
            parseData.add(request.getParameterValues("b_bussiness_address")[0]);
            parseData.add(request.getParameterValues("b_zipcode")[0]);
            parseData.add(request.getParameterValues("b_bussiness_rating")[0]);
            parseData.add(request.getParameterValues("b_start_date")[0]);
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
        String query1 = "Insert into mydb.user_business "
                + "(id_user_business, user_name, password, business_name, email_addr, business_type, business_addr, zipcode, business_rating, start_date) \n"
                + "select count(id_user_casual) + 1, ?, ?, ?, ?, ?, ?, ?, ?, ? from mydb.user_business;";

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
            prpStmt.setString(2, data.get(1)); //password
            prpStmt.setString(3, data.get(2)); //business_name
            prpStmt.setString(4, data.get(3)); //email_addr
            prpStmt.setString(5, data.get(4)); //business_type
            prpStmt.setString(6, data.get(5)); //business_addr
            prpStmt.setString(7, data.get(6)); //zipcode
            prpStmt.setString(8, data.get(7)); //business_rating
            prpStmt.setString(9, data.get(8)); //start_date
            int wtv = prpStmt.executeUpdate();
            System.out.println("Affected rows: " + wtv);
            
            HttpSession hs = httpRequest.getSession();
            BusinessUserInfoBean buser = (BusinessUserInfoBean) lookupBusinessBean(httpRequest);
            LoginBean lb = (LoginBean) lookupLoginBeanBean(httpRequest);
            buser.setSet(true);
            lb.setValid(true);
            /*
            while (rs.next()) {
                if (rs.getString(2).equalsIgnoreCase(data.get(0))) { //check username
                    if (rs.getString(3).equalsIgnoreCase(data.get(1))) { //check password
                        info.setValid(true); //remember valid
                        info.setId(rs.getInt(1)); //remember id
                        info.setName(rs.getString(2));
                        HttpSession hs = httpRequest.getSession();
                        hs.setAttribute("info", info);
                        
                        //retrieve business information
                        BusinessUserInfoBean busi = new BusinessUserInfoBean();
                        busi.setBusinessName(rs.getString(4));
                        busi.setEmail(rs.getString(5));
                        busi.setBusType(rs.getString(6));
                        busi.setBusAddr(rs.getString(7));
                        hs.setAttribute("user", busi);
                        
                        System.out.println("Authentication Successful!");
                        break;
                    }
                }
            }
            */
            
            /*
            //Check in casual users
            prpStmt = conn.prepareStatement(query2);
            prpStmt.setString(1, data.get(0)); //user_name
            prpStmt.setString(2, data.get(1)); //password
            rs = prpStmt.executeQuery();
            
            
            while (rs.next()) {
                if (rs.getString(2).equalsIgnoreCase(data.get(0))) { //check username
                    if (rs.getString(3).equalsIgnoreCase(data.get(1))) { //check password
                        info.setValid(true); //remember valid
                        info.setId(rs.getInt(1)); //remember id
                        info.setName(rs.getString(2));
                        HttpSession hs = httpRequest.getSession();
                        hs.setAttribute("info", info);
                        System.out.println("Authentication Successful!");
                        break;
                    }
                }
            }
            */
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For Registering");
        } catch (NamingException e) {
            Logger.getLogger(AddOfferFormServlet.class.getName()).log(Level.SEVERE, null, e);
        } catch (NullPointerException e) {
            System.out.println("Business User Register Fail");
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

    private BusinessUserInfoBean lookupBusinessBean(HttpServletRequest request) {
        HttpSession httpSession = request.getSession(true);
        BusinessUserInfoBean buser = (BusinessUserInfoBean) httpSession.getAttribute("buser");
        if (buser == null) {
            System.out.println("cuser null at loginHandler");
            buser = new BusinessUserInfoBean();
            httpSession.setAttribute("cuser", buser);
        }
        return buser;
    }
}
