/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import Bean.BusinessUserInfoBean;
import Bean.CasualUserInfoBean;
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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author Eric Ong
 */
public class LoginHandler implements IHandler {
    LoginBean info = new LoginBean();
    HttpServletRequest httpRequest;
    
    @Override
    public List<String> parse(HttpServletRequest request) {
        httpRequest = request;
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
//    public void query(List<String> data, HttpServletRequest request) {
      public void query(List<String> data) {
        Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prpStmt = null;
        String query1 = "Select id_user_business, user_name, password, business_name, "
                + "email_addr, business_type, business_addr from mydb.user_business"
                + " where user_name = ? and password = ?;";
         String query2 = "Select id_user_casual, user_name, password, "
                 + "first_name, last_name, email_addr, birthday, gender from mydb.user_casual"
                + " where user_name = ? and password = ?;";
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("Env located successfully");
            conn = ds.getConnection();
            System.out.println("DataSource Connection success");
            
            info = lookupLoginBeanBean(httpRequest);
            
            //Check in businesses 
            prpStmt = conn.prepareStatement(query1);
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
                        
                        //retrieve business information
                        BusinessUserInfoBean busi = new BusinessUserInfoBean();
                        busi.setBusinessName(rs.getString(4));
                        busi.setEmail(rs.getString(5));
                        busi.setBusType(rs.getString(6));
                        busi.setBusAddr(rs.getString(7));
                        busi.setSet(true);
                        hs.setAttribute("user", busi);
                        
                        System.out.println("Professional Authentication Successful!");
                        break;
                    }
                }
            }
            
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
                        
                        CasualUserInfoBean cu = new CasualUserInfoBean();
                        cu.setFName(rs.getString(4)); 
                        cu.setLName(rs.getString(5));
                        cu.setEmail(rs.getString(6));
                        cu.setBirthday(rs.getString(7));
                        cu.setGender(rs.getString(8));
                        cu.setSet(true);
                        
                        HttpSession hs = httpRequest.getSession();
                        hs.setAttribute("info", info);
                        hs.setAttribute("CUser", cu);
                        System.out.println("Casual Authentication Successful!");
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
    
    private LoginBean lookupLoginBeanBean(HttpServletRequest request) {
        HttpSession httpSession = request.getSession(true);
        LoginBean loginbean = (LoginBean) httpSession.getAttribute("info");
        if(loginbean == null){
            loginbean = new LoginBean();
            httpSession.setAttribute("info", loginbean);
        }
        return loginbean;
    }

    public LoginBean getBean(){
        return info;
    }
}
