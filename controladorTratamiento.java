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
import modeloVO.tratamientoVO;
import modeoDAO.tratamientoDAO;

/**
 *
 * @author nicolas silva
 */
@WebServlet(name = "controladorTratamiento", urlPatterns = {"/Tratamiento"})
public class controladorTratamiento extends HttpServlet {

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
       int idtratamiento = 0;
        String nomTratamiento= request.getParameter("txtnombre");
        String destratamiento=request.getParameter("txtdescripcion");
        int valtratamiento=Integer.parseInt(request.getParameter("txtvalor"));
        String Estado = request.getParameter("txtestado");
       
        tratamientoVO tratvo = new tratamientoVO(idtratamiento, nomTratamiento, destratamiento, valtratamiento, Estado);
        tratamientoDAO tratdao = new tratamientoDAO(tratvo);
        switch(opcion){
            case 1:
                try {
                    if (tratdao.AgregarRegistro()) {
                        request.setAttribute("MensajeExito","se asigno la cita con exito");
                    }else{
                        request.setAttribute("MensajeError","problemas al registrar");
                    }
                } catch (Exception e) {
              System.out.println("Error!" + e.toString());
        }
                request.getRequestDispatcher("agregartratamiento.jsp").forward(request, response);
                break;
            case 2:
                try {
                    if (tratdao.ActualizarRegistro()) {
                        request.setAttribute("MensajeExito","Se actualizo con exito");
                    }else{
                        request.setAttribute("MensajeError","problemas al actualizar la cita");
                    }
                } catch (Exception e) {
                    System.out.println("Error!" + e.toString());
                }
                request.getRequestDispatcher("").forward(request, response);
                break;
            case 3:
                try {
                    if (tratdao.ConsultarRegistro()) {
                        request.setAttribute("MensajeExito","consulta exitosa");
                    }else{
                        request.setAttribute("MensajeError","Problemas al consultar");
                    }
                } catch (Exception e) {
                     System.out.println("Error!" + e.toString());
                }
                request.getRequestDispatcher("").forward(request, response);
                break;
                
            case 4: 
                try {
                    if (tratdao.EliminarRegistro()) {
                        request.setAttribute("MensajeExito","se inactivo el registro seleccionado");
                    }else{
                        request.setAttribute("MensajeError","Problemas al inactvar el registro");
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
