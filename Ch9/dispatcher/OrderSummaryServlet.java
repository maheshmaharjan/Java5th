package dispatcher;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import java.util.*;


@WebServlet("/OrderSummaryServlet")
public class OrderSummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	Submit the form from oderForm.html
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Simulating order summary calculation
        String customerName = request.getParameter("customerName");
        List<String> items = Arrays.asList("Item A", "Item B", "Item C");
        double totalAmount = 150.75;

        // Adding order details to the request scope
        request.setAttribute("customerName", customerName);
        request.setAttribute("items", items);
        request.setAttribute("totalAmount", totalAmount);

        // Forwarding to OrderProcessingServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderProcessingServlet");
        dispatcher.forward(request, response);
	}

}
