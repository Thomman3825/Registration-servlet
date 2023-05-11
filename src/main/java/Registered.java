import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registered extends HttpServlet {
	
public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
	
	String fName = req.getParameter("fName").toString();
	String lName = req.getParameter("lName").toString();
	String email = req.getParameter("email").toString();
	String password = req.getParameter("password").toString();
	
	PrintWriter p = res.getWriter();
	
	
	p.println("First Name:"+fName);
	p.println("First Name:"+lName);
	p.println("Email:"+email);
	p.println("Registered Successfully");
	
	res.setContentType("text/html");
	p.println("<html><body><a href='Login'>Login</a><body></html>");
	
	
	
}
}
