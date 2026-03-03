package httpservlet_programs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		int age=Integer.parseInt(req.getParameter("age"));
		
		System.out.println("UserName:"+name);
		System.out.println("Password:"+pwd);
		System.out.println("Age:"+age);
	}

}
