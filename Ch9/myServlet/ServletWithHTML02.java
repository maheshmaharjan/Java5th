package myServlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;

/**
 * Servlet implementation class ServletWithHTML02
 */

@WebServlet("/ServletWithHTML02")
public class ServletWithHTML02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Define the type of the response data
        response.setContentType("text/html");

        // Open a stream to send the response
        PrintWriter pw = response.getWriter();

        // Send the HTML response
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Greeting Servlet</title>");
        pw.println("<style>");
        pw.println("body { font-family: Arial, sans-serif; margin: 20px; }");
        pw.println("h1 { color: #2c3e50; }");
        pw.println("</style>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>Welcome to Servlets</h1>");
        pw.println("<p>This is a simple greeting message from a servlet.</p>");
        pw.println("</body>");
        pw.println("</html>");
	}

}
