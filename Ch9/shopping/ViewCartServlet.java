package shopping;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/viewCart")
public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();

	     // Retrieve the session
	     HttpSession session = request.getSession(false);

	     // Display the cart
	     out.println("<html><head><title>View Cart</title></head><body>");
	     if (session == null) {
	         out.println("<h3>Your cart is empty! session not created yet</h3>");
	     } else {
	         String cart = (String) session.getAttribute("cart");
	         if (cart == null || cart.trim().isEmpty()) {
	             out.println("<h3>Your cart is empty!</h3>");
	         } else {
	             out.println("<h3>Your Shopping Cart:</h3>");
	             out.println("<p>" + cart + "</p>");
	         }
	     }
	     out.println("<a href='itemEntry'>Add More Items</a>");
	     out.println("</body></html>");
	 }
}
