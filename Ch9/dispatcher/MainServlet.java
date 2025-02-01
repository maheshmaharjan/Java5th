package dispatcher;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Main Servlet Response</h1>");
        out.println("<p>This is the main content of the page.</p>");

        // Including the FooterServlet response
        RequestDispatcher dispatcher = request.getRequestDispatcher("FooterServlet");
        dispatcher.include(request, response);

        out.close();
	}

}
