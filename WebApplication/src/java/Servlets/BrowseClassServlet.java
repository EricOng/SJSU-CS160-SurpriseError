/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Eileen
 */
@WebServlet(name = "BrowseClassServlet", urlPatterns = {"/BrowseClassServlet"})
public class BrowseClassServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         doPost(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         Context initCtx = null;
        Context envCtx = null;
        DataSource ds = null;
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3307/";
        String dbName = "mydb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
 
        Statement st;
      try {
      //      Class.forName(driver).newInstance();
       //     conn = DriverManager.getConnection(url + dbName, userName, password);
             initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("DataSource Connection success");
            conn = ds.getConnection();
            System.out.println("Connected!");
           /* String category = request.getParameter("category");//tochange
 
            ArrayList al = null;
            ArrayList class_list = new ArrayList();
            String query = "select * from classes";
 
            System.out.println("query " + query);
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            int count=0;
            while (rs.next()) {
             /*   //System.out.println("here?= "+ count);
                System.out.print(rs.getString(1)+", ");
                System.out.print(rs.getString(2)+", ");
                System.out.print(rs.getString(3)+", ");
                System.out.print(rs.getString(4)+", ");
                System.out.print(rs.getString(5)+", ");
                System.out.println(rs.getString(6));
            al = new ArrayList();
                al.add(rs.getString(1));
                al.add(rs.getString(2));
                al.add(rs.getString(3));
                al.add(rs.getString(4));
                al.add(rs.getString(5));
                al.add(rs.getString(6));
 
                System.out.println("al :: " + al);
                class_list.add(al);
                count++;
            }
            System.out.println("=====================================");
            System.out.println("# of rows: "+count);
            System.out.println("=====================================");

            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/searchview.jsp");
           request.setAttribute("classes", class_list);
            view.forward(request, response);*/
           request.getRequestDispatcher("/WEB-INF/Class.jsp").forward(request, response);
            conn.close();
            System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
