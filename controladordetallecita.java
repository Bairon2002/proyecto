/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloVO.detallecitaVO;
import modeoDAO.detallecitaDAO;


/**
 *
 * @author nicolas silva
 */
@WebServlet(name = "controladordetallecita", urlPatterns = {"/controladordetallecita"})
public class controladordetallecita extends HttpServlet {

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
        PrintWriter out = response.getWriter();
           int opcion = Integer.parseInt(request.getParameter("opcion"));
           int Iddetalleprdidocita= 0;
           String Fecdetallepedidocita = request.getParameter("txtfecha");
           int Idprdidocita= Integer.parseInt(request.getParameter("cita"));
           int idpersona = Integer.parseInt(request.getParameter("persona"));
         String estado = request.getParameter("txtestado");
         detallecitaVO detapedcit = new detallecitaVO(Iddetalleprdidocita, Fecdetallepedidocita, Idprdidocita, idpersona, estado);
         detallecitaDAO detacitdao = new detallecitaDAO(detapedcit);
        switch(opcion){
            case 1:
                try {
                    if (detacitdao.AgregarRegistro()) {
                        request.setAttribute("MensajeExito","se asigno la cita con exito");
                    }else{
                        request.setAttribute("MensajeError","problemas al registrar");
                    }
                } catch (Exception e) {
              System.out.println("Error!" + e.toString());
        }
                request.getRequestDispatcher("").forward(request, response);
                break;
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
        processRequest(request, response);
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
