package myServlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/FormProcessingServlet04")
public class FormProcessingServlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter pw = response.getWriter();

	        // Retrieve form data
	        String firstName = request.getParameter("firstName");
	        String middleName = request.getParameter("middleName");
	        String lastName = request.getParameter("lastName");
	        String age = request.getParameter("age");
	        String ssn = request.getParameter("ssn");
	        String city = request.getParameter("city");
	        String state = request.getParameter("state");
	        String country = request.getParameter("country");

	        // Generate HTML response
	        pw.println("<!DOCTYPE html>");
	        pw.println("<html lang='en'>");
	        pw.println("<head>");
	        pw.println("<meta charset='UTF-8'>");
	        pw.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	        pw.println("<title>Form Submission Result</title>");
	        pw.println("<style>");
	        pw.println("body { font-family: Arial, sans-serif; margin: 20px; }");
	        pw.println("h1 { color: #4CAF50; }");
	        pw.println("table { border-collapse: collapse; width: 50%; margin-top: 20px; }");
	        pw.println("td { padding: 10px; border: 1px solid #ccc; }");
	        pw.println("</style>");
	        pw.println("</head>");
	        pw.println("<body>");
	        pw.println("<h1>Form Submission Result</h1>");
	        pw.println("<table>");
	        pw.println("<tr><td>First Name</td><td>" + firstName + "</td></tr>");
	        pw.println("<tr><td>Middle Name</td><td>" + middleName + "</td></tr>");
	        pw.println("<tr><td>Last Name</td><td>" + lastName + "</td></tr>");
	        pw.println("<tr><td>Age</td><td>" + age + "</td></tr>");
	        pw.println("<tr><td>SSN</td><td>" + ssn + "</td></tr>");
	        pw.println("<tr><td>City</td><td>" + city + "</td></tr>");
	        pw.println("<tr><td>State</td><td>" + state + "</td></tr>");
	        pw.println("<tr><td>Country</td><td>" + country + "</td></tr>");
	        pw.println("</table>");
	        pw.println("</body>");
	        pw.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
