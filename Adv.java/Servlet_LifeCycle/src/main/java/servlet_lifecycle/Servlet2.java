 package servlet_lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet
{
	public Servlet2() {
		System.out.println("1st phase executed...2");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("2nd phase executed...2");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("3rd phase executed..2");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("4th phase eecuted ....2");
	}
}
