/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import Bean.ReviewBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import Bean.DetailedClassBean;

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
       
        ResultSet rs = null;
        PreparedStatement prpStmt = null;
        String query = "Select *"
                + " from mydb.classes"
                + " where id_class = ? ;";
        String query_review = "select A.id_reviews, A.class_id, B.id_user_casual, B.user_name, A.review_text"
                + " from mydb.reviews A, mydb.user_casual B"
                + " where A.class_id = ? and A.user_id = B.id_user_casual;";
 
        Statement st;
      try {
    
             initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("DataSource Connection success");
            conn = ds.getConnection();
            System.out.println("Connected!");
            System.out.println("Parameter****************** "+request.getParameter("param1"));
           
          
            System.out.println("query " + query);
            prpStmt = conn.prepareStatement(query);
            prpStmt.setString(1, request.getParameter("param1")); //class id
            rs = prpStmt.executeQuery();
            DetailedClassBean newClass = new DetailedClassBean();
            newClass.reset();
            while (rs.next()) {
              //System.out.println("here?= "+ count);
                System.out.println("1: "+rs.getString(1)+", ");
                System.out.println("2: "+rs.getString(2)+", ");
                System.out.println("3: "+rs.getString(3)+", ");
                System.out.println("4: "+rs.getString(4)+", ");
                System.out.println("5: "+rs.getString(5)+", ");
                System.out.println("6: "+rs.getString(6)+", ");
                System.out.println("7: "+rs.getString(7)+", ");
                System.out.println("8: "+rs.getString(8)+", ");
                System.out.println("9: "+rs.getString(9)+", ");
                System.out.println("10: "+rs.getString(10));
                
                
                newClass.setClassId(Integer.parseInt(rs.getString(1)));
                newClass.setClassName(rs.getString(2));
                newClass.setClassCategory(rs.getString(3));
                newClass.setDescription(rs.getString(4));
                newClass.setCost(Double.parseDouble(rs.getString(5)));
                newClass.setClassType(rs.getString(6));
                newClass.setURL(rs.getString(7));
                newClass.setDuration(rs.getString(8));
                newClass.setAvailability(rs.getString(9));
                newClass.setClassPrereqs(rs.getString(10));
               
            }
            
            
                  System.out.println("-----------------------------------------");
                  prpStmt = conn.prepareStatement(query_review);
                  System.out.println("class id= "+request.getParameter("param1"));
                  prpStmt.setString(1, request.getParameter("param1")); //class_id
                  rs = prpStmt.executeQuery();
                  while (rs.next()) {
                    System.out.println("*********here?");
                    System.out.print(rs.getString(1)+", ");
                    System.out.print(rs.getString(2)+", ");
                    System.out.print(rs.getString(3)+", ");
                    System.out.print(rs.getString(4)+", ");
                    System.out.println(rs.getString(5));


                    ReviewBean newReview = new ReviewBean();
                    newReview.setReviewId(Integer.parseInt(rs.getString(1)));
                    newReview.setClassId(Integer.parseInt(rs.getString(2)));
                    newReview.setUserId(Integer.parseInt(rs.getString(3)));
                    newReview.setUserName(rs.getString(4));
                    newReview.setText(rs.getString(5));
                    newClass.addToReviewList(newReview);
                    
                }
                   System.out.println("-----------------------------------------");
            
            System.out.println("=====================================");
            System.out.println("# of rows: ");
            System.out.println("=====================================");

            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Class.jsp");
           request.setAttribute("class", newClass);
            view.forward(request, response);
         //  request.getRequestDispatcher("/WEB-INF/Class.jsp").forward(request, response);
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
