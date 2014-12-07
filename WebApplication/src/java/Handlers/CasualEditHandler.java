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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ROB
 */
public class CasualEditHandler implements IHandler{
    CasualUserInfoBean cuser = new CasualUserInfoBean();
    HttpServletRequest httpRequest;

    public List<String> parse(HttpServletRequest request) {
        httpRequest = request;
        
        System.out.println("At edit parser");
        List<String> data = new ArrayList<String>();
        HttpSession hs = request.getSession();
        CasualUserInfoBean cuser = (CasualUserInfoBean) hs.getAttribute("cuser");
        String fullname = request.getParameterValues("name")[0];
        String fname = fullname.replaceFirst("\\s.*", "");
        String lname = fullname.replaceFirst(".*\\s", "");
        data.add(fname);
        data.add(lname);
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
        cuser = lookupCasualBean(httpRequest);
        
        String query1 = "update mydb.user_casual " 
                + "set first_name = ?, last_name = ?, email_addr = ? "
                + "where id_user_casual = " + cuser.getUserID()+ ";";
                

        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("Env located successfully");
            conn = ds.getConnection();
            System.out.println("DataSource Connection success");

            prpStmt = conn.prepareStatement(query1);
//            prpStmt.setString(1, bean.getUserName()); //user_name
            prpStmt.setString(1, data.get(0)); //first_name
            prpStmt.setString(2, data.get(1)); //last_name
            prpStmt.setString(3, data.get(2)); //email_addr
//            prpStmt.setString(5, bean.getPassword()); //password
//            prpStmt.setString(6, bean.getBirthday()); //birthday
            
            int a = prpStmt.executeUpdate();
            cuser.setFName(data.get(0));
            cuser.setLName(data.get(1));
            cuser.setEmail(data.get(2));
            httpRequest.getSession().setAttribute("cuser", cuser);
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
}
