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
import modeoDAO.MedicamentoDAO;
import modeloVO.MedicamentoVO;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorMedicamento", urlPatterns = {"/Medicamento"})
public class ControladorMedicamento extends HttpServlet {

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

        String idMedicamento = request.getParameter("txtidMedicamento");
        String nomMedicamento = request.getParameter("txtnomMedicamento");
        String tipMedicamento = request.getParameter("txttipMedicamento");
        String conMedicamento = request.getParameter("txtconMedicamento");
        String valMedicamento = request.getParameter("txtvalMedicamento");
        String StoMedicamento = request.getParameter("txtStoMedicamento");
        String labMedicamento = request.getParameter("txtlabMedicamento");
        String estado=request.getParameter("estActivo");
       

        MedicamentoVO medVO = new MedicamentoVO(idMedicamento,nomMedicamento, tipMedicamento, conMedicamento, valMedicamento, StoMedicamento, labMedicamento, estado);
        MedicamentoDAO medDAO = new MedicamentoDAO(medVO);

        switch (opcion) {
            case 1://Agregar registro
                if (medDAO.AgregarRegistro()) {

                    request.setAttribute("MensajeExito", "El medicamento fue registrado correctamente");

                } else {
                    request.setAttribute("MensajeError", "El medicamento no fue registrado correctamente");
                }
                request.getRequestDispatcher("registrarMedicamento.jsp").forward(request, response);
                break;
            case 2: // Actualizar registro
                if (medDAO.ActualizarRegistro()) {

                    request.setAttribute("MensajeExito", "El medicamento fue actualizado correctamente");

                } else {
                    request.setAttribute("MensajeError", "El medicamento no fue actualizado correctamente");
                }
                request.getRequestDispatcher("actualizarMedicamento.jsp").forward(request, response);

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
