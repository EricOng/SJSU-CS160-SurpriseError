/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Eric Ong
 */
public class AddOfferFormHandler implements IHandler {

    @Override
    public List<String> parse(HttpServletRequest request) {
        List<String> parseData = new ArrayList<String>();

        String raw = request.getQueryString();
        String container[] = raw.split("&");
        parseData = Arrays.asList(container);
        return parseData;
    }

    @Override
    public List<String> query(List<String> data) {
        Statement stmt = null;
        String query = "select * from mydb.classes;";
        try {
            stmt = DatabaseConnection.getSingleton().getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString("class_name"));
            }
        }
        catch (SQLException e) {
            System.out.println("SQL Exception Found");
        }
        return new ArrayList<String>();
    }

}
