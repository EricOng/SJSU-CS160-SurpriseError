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
import Bean.ClassBean;

/**
 *
 * @author Eric Ong
 */
public class LoginHandler implements IHandler {
    LoginBean info = new LoginBean();
    CasualUserInfoBean cuser = new CasualUserInfoBean();
    BusinessUserInfoBean buser = new BusinessUserInfoBean();
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
         String query_class = "Select * from mydb.classes A, mydb.classes_business B"
                 + "where B.id_user_business = ?;";
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("Env located successfully");
            conn = ds.getConnection();
            System.out.println("DataSource Connection success");
            
            info = lookupLoginBeanBean(httpRequest);
            cuser = lookupCasualBean(httpRequest);
            buser = lookupBusiBean(httpRequest);
                    
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
                        buser.setUserID(rs.getString(1));
                        buser.setBusinessName(rs.getString(4));
                        buser.setEmail(rs.getString(5));
                        buser.setBusType(rs.getString(6));
                        buser.setBusAddr(rs.getString(7));
                        buser.setSet(true);
                        hs.setAttribute("buser", buser);
                        
                        System.out.println("Professional Authentication Successful!");
                        break;
                    }
                }
            }
            if(buser.isSet()){
                  System.out.println("-----------------------------------------");
                  prpStmt = conn.prepareStatement(query_class);
                  System.out.println("business id= "+buser.getUserID());
                  prpStmt.setString(1, buser.getUserID()); //user_id
                  rs = prpStmt.executeQuery();
                  while (rs.next()) {
                    System.out.println("here?");
                    System.out.print(rs.getString(1)+", ");
                    System.out.print(rs.getString(2)+", ");
                    System.out.print(rs.getString(3)+", ");
                    System.out.print(rs.getString(4)+", ");
                    System.out.print(rs.getString(5)+", ");
                    System.out.println(rs.getString(6));


                    ClassBean newClass = new ClassBean();
                    newClass.setClassId(Integer.parseInt(rs.getString(1)));
                    newClass.setClassName(rs.getString(2));
                    newClass.setClassCategory(rs.getString(3));
                    newClass.setDescription(rs.getString(4));
                    newClass.setCost(Double.parseDouble(rs.getString(5)));
                    newClass.setType(rs.getString(6));
                    buser.addToClassList(newClass);
                    
                }
                   System.out.println("-----------------------------------------");
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
                        
                        cuser.setUserID(rs.getString(1)); 
                        cuser.setFName(rs.getString(4)); 
                        cuser.setLName(rs.getString(5));
                        cuser.setEmail(rs.getString(6));
                        cuser.setBirthday(rs.getString(7));
                        cuser.setGender(rs.getString(8));
                        cuser.setSet(true);
                        
                        HttpSession hs = httpRequest.getSession();
                        hs.setAttribute("info", info);
                        hs.setAttribute("cuser", cuser);
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

    private CasualUserInfoBean lookupCasualBean(HttpServletRequest request) {
        HttpSession httpSession = request.getSession(true);
        CasualUserInfoBean cuser = (CasualUserInfoBean) httpSession.getAttribute("cuser");
        if(cuser == null){
            System.out.println("cuser null at loginHandler");
            cuser = new CasualUserInfoBean();
            httpSession.setAttribute("cuser", cuser);
        }
        return cuser;
    }
    private ClassBean getClassBean(){
        ClassBean myClass = new ClassBean();
        return myClass;
    }
    private BusinessUserInfoBean lookupBusiBean(HttpServletRequest request) {
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
