/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import Servlets.AddOfferFormServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
        List<String> parseData = new ArrayList<String>();
        //Parse only the first value from each Field of the AddOfferForm
        try {
            parseData.add(request.getParameterValues("Title")[0]);
            parseData.add(request.getParameterValues("Category")[0]);
            parseData.add(request.getParameterValues("Description")[0]);
            parseData.add(request.getParameterValues("Cost")[0]);
            parseData.add(request.getParameterValues("Style")[0]);
            parseData.add(request.getParameterValues("Url")[0]);
            parseData.add(request.getParameterValues("Length")[0]);
            parseData.add(request.getParameterValues("Time")[0]);
        } catch (NullPointerException e){
            return new ArrayList<String>();
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
        Statement stmt = null;
        PreparedStatement prpStmt = null;
        String query = "insert into mydb.classes (id_class, class_name, "
                + "class_category, description, cost, class_style, "
                + "class_url, class_duration, class_availability) "
                + "select count(id_class)+1, ?, ?, ?, ?, ?, ?, ?, ? from mydb.classes;";
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("DataSource Connection success");
            conn = ds.getConnection();
            //stmt = conn.createStatement();

            prpStmt = conn.prepareStatement(query);

            prpStmt.setString(1, data.get(0));  //title
            prpStmt.setString(2, data.get(1));  //category
            prpStmt.setString(3, data.get(2));  //description
            prpStmt.setInt(4, Integer.valueOf(data.get(3)));  //cost
            prpStmt.setString(5, data.get(4));  //style
            prpStmt.setString(6, data.get(5));  //link
            prpStmt.setString(7, data.get(6));  //length
            prpStmt.setString(8, data.get(7));  //time/availability

            int rowsAffected = prpStmt.executeUpdate();
            System.out.println("Rows Affected: " + rowsAffected);
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception Found Querying For AddOfferForm");
        } catch (NumberFormatException e) {
            System.out.println("Issue converting Cost into an Integer.");
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
