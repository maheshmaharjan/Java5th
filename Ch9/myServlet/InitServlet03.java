package myServlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;

/**
 * Servlet implementation class InitServlet03
 */

//@WebServlet("/initDemo")
public class InitServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String drivername;   // Driver name for database
    private String databaseURL;  // Database connection URL
    
    public void init(ServletConfig config) throws ServletException {
        // Retrieve initialization parameters from web.xml
        drivername = config.getInitParameter("driver");
        databaseURL = config.getInitParameter("URL");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        // Send the response to the client
        pw.println("<html>");
        pw.println("<head><title>Initialization Demo</title></head>");
        pw.println("<body>");
        pw.println("<h1>Driver Name: " + drivername + "</h1>");
        pw.println("<h1>Database URL: " + databaseURL + "</h1>");
        pw.println("</body>");
        pw.println("</html>");
	}

}
