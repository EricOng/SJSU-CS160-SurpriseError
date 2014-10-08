/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import Servlets.AddOfferFormServlet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

/**
 *
 * @author Eric Ong
 */
public class AddOfferFormHandler implements IHandler {

    @Override
    public List<String> parse(HttpServletRequest request) {
        try {
            List<String> parseData = new ArrayList<String>();
            System.out.println(request.toString());
            String raw = request.getQueryString();
            String container[] = raw.split("&");
            parseData = Arrays.asList(container);
            return parseData;
        } catch (NullPointerException e){
            return new ArrayList<String>();
        }
    }

    @Override
    public void query(List<String> data) {

        Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        String query = "select * from mydb.classes;";
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            //stmt = ds.getConnection().prepareStatement(query);
            System.out.println("DataSource Connection success");
            conn = ds.getConnection();
            stmt = conn.createStatement();

            rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString("class_name"));
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For AddOfferForm");
        } catch (NamingException e) {
            Logger.getLogger(AddOfferFormServlet.class.getName()).log(Level.SEVERE, null, e);
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
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {;
                }
                stmt = null;
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
