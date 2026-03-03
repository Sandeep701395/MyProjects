package servlet_chaining_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		
		
		if(email.equals("sai@gmail.com") && pwd.equals("sai@123"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			PrintWriter pw=resp.getWriter();
			pw.println("<h1 style=color:red;> invalid Email and Password...</h1>");
			rd.include(req, resp);
		}
	}

}
