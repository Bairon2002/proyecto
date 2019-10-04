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
import modeoDAO.PersonaDAO;
import modeloVO.PersonaVO;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorPersona", urlPatterns = {"/Persona"})
public class ControladorPersona extends HttpServlet {

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

        String Idpersona= request.getParameter("txtidPersona");
        String nomPersona= request.getParameter("txtnomPersona");
        String apePersona= request.getParameter("txtapePersona");
        String docPersona= request.getParameter("txtdocPersona");
        String fecNacimiento= request.getParameter("txfecNacimiento");
        String telPersona= request.getParameter("txttelPersona");
        String corPersona= request.getParameter("txtcorPersona");
        String tarProfesion= request.getParameter("txttarProfesion");
        String estado=request.getParameter("estActivo");

        PersonaVO perVO = new PersonaVO(Idpersona, nomPersona, apePersona, docPersona, fecNacimiento, telPersona, corPersona, tarProfesion, estado);
           PersonaDAO perDAO = new PersonaDAO(perVO);

        
        switch (opcion) {
            case 1://Agregar registro
                if (perDAO.AgregarRegistro()) {

                    request.setAttribute("MensajeExito", "La Persona fue registrada correctamente");

                } else {
                    request.setAttribute("MensajeError", "La Persona no fue registrada correctamente");
                }
                request.getRequestDispatcher("informacion_Personas.jsp").forward(request, response);
                break;
            case 2: // Actualizar registro
                if (perDAO.ActualizarRegistro()) {

                    request.setAttribute("MensajeExito", "La Persona fue actualizada correctamente");

                } else {
                    request.setAttribute("MensajeError", "La Persona no fue actualizada correctamente");
                }
                request.getRequestDispatcher("actualizarPersona.jsp").forward(request, response);

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
