package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.sql.DataSource;
import Bean.ClassBean;

/**
 *
 * @author Eileen
 */
@WebServlet(name = "SearchServlet", urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {

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
        PreparedStatement prpStmt = null;
        ResultSet rs = null;
        
        /*** Database Query ***/
        String category = "";
        String keyword = "";
        String zipcode = "";
        boolean whereClause =false;

        String query1 = "Select * from mydb.classes";
             //   + " where class_category = ? and ( class_name like ? or description like ?);";

 
        /*** Database Query ***/
        
        Statement st;
        try {
            initCtx = new InitialContext();
            envCtx = (Context) initCtx.lookup("java:comp/env");
            System.out.println("Getting Datasource");
            ds = (DataSource) envCtx.lookup("jdbc/mydb");
            System.out.println("DataSource Connection success");
            conn = ds.getConnection();
            System.out.println("Connected!");
            
            if(!request.getParameter("category").equals("Category")){
                 category = request.getParameter("category");
                 query1+= " where class_category = \'"+category+"\'";
                 whereClause = true;
            }
           
            
            if(!request.getParameter("keyword").equals("")){
                 keyword = "%"+request.getParameter("keyword")+"%";
                 if(!whereClause){  
                     query1+=" where class_name like \'"+keyword+"\' or description like \'"+keyword+"\'" ;
                 } else{
                     query1+=" and ( class_name like \'"+keyword+"\' or description like \'"+keyword+"\')" ;
                 }
            }
            
            
            if(!request.getParameter("zipcode").equals("")){
                 zipcode = request.getParameter("zipcode");
            }else{
                 zipcode = "";
            } 
            System.out.println("Zipcode = "+zipcode);
            
            
            ArrayList al = null;
            ArrayList class_list = new ArrayList();
            st = conn.createStatement();
            prpStmt = conn.prepareStatement(query1);
            rs = prpStmt.executeQuery();

            System.out.println("query:\n " + prpStmt.toString());
          
            int count=0;
            while (rs.next()) {
                //System.out.println("here?= "+ count);
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
 
                ClassBean newClass = new ClassBean();
                newClass.setClassId(Integer.parseInt(rs.getString(1)));
                newClass.setClassName(rs.getString(2));
                newClass.setClassCategory(rs.getString(3));
                newClass.setDescription(rs.getString(4));
                newClass.setCost(Double.parseDouble(rs.getString(5)));
                newClass.setType(rs.getString(6));
                
                
                System.out.println("al :: " + al);
               // class_list.add(al);
                class_list.add(newClass);
                count++;
            }
            System.out.println("=====================================");
            System.out.println("# of rows: "+count);
            System.out.println("=====================================");
              System.out.println("class_list: "+class_list.size());
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/searchview.jsp");
            request.setAttribute("classes", class_list);
            view.forward(request, response);
            
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
