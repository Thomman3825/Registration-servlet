import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		String fName = req.getParameter("fName").toString();
		String lName = req.getParameter("lName").toString();
		String email = req.getParameter("email").toString();
		String password = req.getParameter("password").toString();
		
		
//		PrintWriter p = res.getWriter();
//		p.println("First Name:"+fName);
		
		req.setAttribute("fName", fName);
		req.setAttribute("lName", lName);
		req.setAttribute("email", email);
		req.setAttribute("password", password);
		
		RequestDispatcher rd = req.getRequestDispatcher("Registered");
		rd.forward(req, res);
		
	}
}
