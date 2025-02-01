package shopping;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/itemEntry")
public class ItemEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();

	     out.println("<html><head><title>Add Item</title></head><body>");
	     out.println("<h3>Add an Item to Your Shopping Cart</h3>");
	     out.println("<form action='addToCart' method='POST'>");
	     out.println("<label for='item'>Item:</label>");
	     out.println("<input type='text' id='item' name='item' required>");
	     out.println("<input type='submit' value='Add to Cart'>");
	     out.println("</form>");
	     out.println("<br><a href='viewCart'>View Cart</a>");
	     out.println("</body></html>");
	}

}
