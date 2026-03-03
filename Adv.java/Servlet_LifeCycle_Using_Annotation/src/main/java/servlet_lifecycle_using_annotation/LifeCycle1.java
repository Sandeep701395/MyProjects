package servlet_lifecycle_using_annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/life",loadOnStartup = 10)
public class LifeCycle1 extends HttpServlet
{
	public LifeCycle1() {
		System.out.println("Executed phase 1...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Executed phase 2...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		System.out.println(name);
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>"
				+ "<form action=two method=post>"
				+ "<button>Submit</button>"
				+ "</form>"
				+ "</body></html>");
		System.out.println("Executed phase 3...");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Executed phase 4...");
	}

}
