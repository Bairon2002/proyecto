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
import modeoDAO.UsuarioDAO;
import modeloVO.UsuarioVO;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorUsuario", urlPatterns = {"/Usuario"})
public class ControladorUsuario extends HttpServlet {

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

        String nomUsuario = request.getParameter("txtnomUsuario");
        String pasUsuario = request.getParameter("txtpasUsuario");
        String idRol = request.getParameter("txtidRol");
        String Idpersona = request.getParameter("txtIdpersona");
        String estado = request.getParameter("estActivo");

        UsuarioVO usuVO = new UsuarioVO(nomUsuario, pasUsuario, idRol, Idpersona, estado);
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);

        switch (opcion) {
            case 1://Agregar registro
                if (usuDAO.AgregarRegistro()) {

                    request.setAttribute("MensajeExito", "El Usuario fue registrado correctamente");

                } else {
                    request.setAttribute("MensajeError", "El Usuario no fue registrado correctamente");
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;
            case 2: // Actualizar registro
                if (usuDAO.ActualizarRegistro()) {

                    request.setAttribute("MensajeExito", "El Usuario fue actualizado correctamente");

                } else {
                    request.setAttribute("MensajeError", "El Usuario no fue actualizado correctamente");
                }
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);

                break;
            case 3: // validar acceso
                if (usuDAO.ValidarAcceso(nomUsuario, pasUsuario, idRol)) {

                    if (idRol.equals("Medico")) {

                        request.getRequestDispatcher("Menu.jsp").forward(request, response);

                    } else if (idRol.equals("Cliente")) {

                        request.getRequestDispatcher("Menu_Cliente.jsp").forward(request, response);

                    } else {
                        request.getRequestDispatcher("Menu_Proveedor.jsp").forward(request, response);
                    }

                } else {
                    request.setAttribute("MensajeError", "El Usuario y/o Contraseña Estan Incorrectos");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
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
