package dispatcher;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/OrderProcessingServlet")
public class OrderProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();

	     // Retrieving data from request scope
	     String customerName = (String) request.getAttribute("customerName");
	     List<String> items = (List<String>) request.getAttribute("items");
	     double totalAmount = (double) request.getAttribute("totalAmount");
	     
	     // Payment Processing done here
	     
	     // Simulating order processing
	     out.println("<h1>Order Confirmation</h1>");
	     out.println("<p>Thank you, " + customerName + "! Your order has been processed.</p>");
	     out.println("<h3>Order Details:</h3>");
	     out.println("<ul>");
	     for (String item : items) {
	         out.println("<li>" + item + "</li>");
	     }
	     out.println("</ul>");
	     out.println("<p>Total Amount: $" + totalAmount + "</p>");
	     out.close();
	}

}
