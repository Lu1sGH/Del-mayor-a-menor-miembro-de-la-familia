package resultados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Axel Zarate Lozano
 */
@WebServlet(urlPatterns = {"/datosServlet"})
public class datosServlet extends HttpServlet {
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int parEA = 0;
            int parEB = 0;
            int parEC = 0;
            String parNA = null;
            String parNB = null;
            String parNC = null;
            
            parEA = Integer.parseInt(request.getParameter("eA"));
            parNA = request.getParameter("nA");
            parEB = Integer.parseInt(request.getParameter("eB"));
            parNB = request.getParameter("nB");
            parEC = Integer.parseInt(request.getParameter("eC"));
            parNC = request.getParameter("nC");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Logica</title>");           
            out.println("</head>");
            out.println("<body background=\"campo.jpg\">");
            out.println("<h1> ¡Resultado! </h1>");
            switch(resultado(parEA, parEB, parEC)){
                case 0:
                    out.println("Alguno de los datos ingresados es incorrecto.");
                    break;
                case 1:
                    out.println("<b>Mayor</b>: "+parNA+"<br>");
                    out.println("<b>Edad</b>: "+parEA+"<br>");
                    out.println("<br>");
                    out.println("<b>El de en medio</b>: "+parNB+"<br>");
                    out.println("<b>Edad</b>: "+parEB+"<br>");
                    out.println("<br>");
                    out.println("<b>Menor</b>: "+parNC+"<br>");
                    out.println("<b>Edad</b>: "+parEC+"<br>");
                    break;
                case 2:
                    out.println("<b>Mayor</b>: "+parNA+"<br>");
                    out.println("<b>Edad</b>: "+parEA+"<br>");
                    out.println("<br>");
                    out.println("<b>El de en medio</b>: "+parNC+"<br>");
                    out.println("<b>Edad</b>: "+parEC+"<br>");
                    out.println("<br>");
                    out.println("<b>Menor</b>: "+parNB+"<br>");
                    out.println("<b>Edad</b>: "+parEB+"<br>");
                    break;
                case 3:
                    out.println("<b>Mayor</b>: "+parNB+"<br>");
                    out.println("<b>Edad</b>: "+parEB+"<br>");
                    out.println("<br>");
                    out.println("<b>El de en medio</b>: "+parNA+"<br>");
                    out.println("<b>Edad</b>: "+parEA+"<br>");
                    out.println("<br>");
                    out.println("<b>Menor</b>: "+parNC+"<br>");
                    out.println("<b>Edad</b>: "+parEC+"<br>");
                    break;
                case 4:
                    out.println("<b>Mayor</b>: "+parNB+"<br>");
                    out.println("<b>Edad</b>: "+parEB+"<br>");
                    out.println("<br>");
                    out.println("<b>El de en medio</b>: "+parNC+"<br>");
                    out.println("<b>Edad</b>: "+parEC+"<br>");
                    out.println("<br>");
                    out.println("<b>Menor</b>: "+parNA+"<br>");
                    out.println("<b>Edad</b>: "+parEA+"<br>");
                    break;
                case 5:
                    out.println("<b>Mayor</b>: "+parNC+"<br>");
                    out.println("<b>Edad</b>: "+parEC+"<br>");
                    out.println("<br>");
                    out.println("<b>El de en medio</b>: "+parNA+"<br>");
                    out.println("<b>Edad</b>: "+parEA+"<br>");
                    out.println("<br>");
                    out.println("<b>Menor</b>: "+parNB+"<br>");
                    out.println("<b>Edad</b>: "+parEB+"<br>");
                    break;
                case 6:
                    out.println("<b>Mayor</b>: "+parNC+"<br>");
                    out.println("<b>Edad</b>: "+parEC+"<br>");
                    out.println("<br>");
                    out.println("<b>El de en medio</b>: "+parNB+"<br>");
                    out.println("<b>Edad</b>: "+parEB+"<br>");
                    out.println("<br>");
                    out.println("<b>Menor</b>: "+parNA+"<br>");
                    out.println("<b>Edad</b>: "+parEA+"<br>");
                    break;
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private static int resultado(int parEA, int parEB, int parEC){
        int ord = 0;
        if (parEA > parEB && parEB > parEC) {
            ord = 1;
        }
        else{
            if (parEA > parEB && parEC > parEB && parEA > parEC) {
                ord = 2;
            }
            else{
                if (parEB > parEA && parEA > parEC) {
                    ord = 3;
                }
                else{
                    if (parEB > parEA && parEC > parEA && parEB > parEC) {
                        ord = 4;
                    }
                    else{
                        if (parEC > parEA && parEA > parEB) {
                            ord = 5;
                        }
                        else{
                            if (parEC > parEA && parEB > parEA && parEC > parEB) {
                                ord = 6;
                            }
                        }
                    }
                }
            }
        }
        return ord;
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
