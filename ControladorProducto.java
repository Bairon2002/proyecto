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
import modeoDAO.productoDAO;
import modeloVO.productoVO;

/**
 *
 * @author chebi
 */
@WebServlet(name = "ControladorProducto", urlPatterns = {"/Producto"})
public class ControladorProducto extends HttpServlet {

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
       int idproducto = 0;
        String nomProducto = request.getParameter("txtNombreProducto");
        String tipoProducto = request.getParameter("txtTipoProducto");
        String valProducto =request.getParameter("valor");
        String estado=request.getParameter("estActivo");
        
        productoVO productovo = new productoVO(idproducto,nomProducto, tipoProducto, valProducto,estado);
        productoDAO productodao = new productoDAO (productovo);
        switch (opcion) {
            case 1:
                if (productodao.AgregarRegistro()) {
                    request.setAttribute("MensajeExito", "Producto registrado");
                } else {
                    request.setAttribute("MensajeError", "problemas al registrar");
                }
                request.getRequestDispatcher("registrarProducto.jsp").forward(request, response);
                break;
            case 2:
                if (productodao.ActualizarRegistro()) {
                    request.setAttribute("MensajeExito", "el producto a sido actualizado");
                } else {
                    request.setAttribute("MensajeError", "no se pudo actualizar");
                }
                request.getRequestDispatcher("ActualizarProducto.jsp").forward(request, response);
                break;
            case 3:
                if (productodao.ConsultarRegistro()) {
                    request.setAttribute("MensajeExito", "consulta Exitosa");
                } else {
                    request.setAttribute("MensajeError", "problemas en la consulta");
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
