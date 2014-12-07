/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Bean.CasualUserInfoBean;
import Bean.LoginBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Handlers.CasualEditHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;


/**
 *
 * @author Roberto Villasenor
 */
@WebServlet(name = "CasualEditServlet", urlPatterns = {"/CasualEditServlet"})
public class CasualEditServlet extends HttpServlet {

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
            throws ServletException, IOException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        
        CasualEditHandler handler = new CasualEditHandler();
        CasualUserInfoBean casualBean = new CasualUserInfoBean();
        
        HttpSession httpSession = request.getSession(true);
        LoginBean info = (LoginBean) httpSession.getAttribute("info");
        if(info != null){
            casualBean = handler.parse(request);
            handler.query(casualBean);
        }
        
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
        request.getRequestDispatcher("../../../web/WEB-INF/dashboard.jsp").forward(request, response);
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
        try {     
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(CasualEditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
          request.getRequestDispatcher("../../../web/WEB-INF/dashboard.jsp").forward(request, response);
          
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
