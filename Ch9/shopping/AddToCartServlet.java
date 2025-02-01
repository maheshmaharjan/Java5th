package shopping;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve the item from the request
        String item = request.getParameter("item"); // scooty

        // Get the session (create a new one if it doesn't exist)
        HttpSession session = request.getSession(true);

        // Retrieve the current cart or initialize it
        String cart = (String) session.getAttribute("cart"); // bike car
        if (cart == null) {
            cart = "";
        }

        // Add the item to the cart
        cart += item + " "; // bike car scooty

        // Save the updated cart back in the session
        session.setAttribute("cart", cart); // bike car scooty 

        // Display a confirmation
        out.println("<html><head><title>Item Added</title></head><body>");
        out.println("<h3>Item '" + item + "' added to your cart!</h3>");
        out.println("<a href='viewCart'>View Cart</a> | <a href='itemEntry'>Add More Items</a>");
        out.println("</body></html>");
	}

}
