package servlet_lifecycle_using_annotation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/two",loadOnStartup = 3)
public class Servlet2 extends HttpServlet
{
	public Servlet2() {
		System.out.println("Executed phase 1... Servlet2");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Executed phase 2... Servlet2");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executed phase 3... Servlet2");
	}
	@Override
	public void destroy() {
		System.out.println("Executed phase 4... Servlet2");
	}

}
