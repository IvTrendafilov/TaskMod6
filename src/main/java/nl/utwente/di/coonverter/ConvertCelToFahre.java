package nl.utwente.di.coonverter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Example of a Servlet that gets an ISBN number and returns the book price
 */

public class ConvertCelToFahre extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Converter cel;

    public void init() throws ServletException {
        cel = new Converter();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML>\n";
        String title = "Converter for temperature";
        out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                "</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +
                "  <P>Temperature in degrees: " +
                request.getParameter("cell") + "\n" +
                "  <P>Temperature in fahrenheit: " +
                Double.toString(cel.convert(request.getParameter("cell"))) +
                "</BODY></HTML>");
    }


}
