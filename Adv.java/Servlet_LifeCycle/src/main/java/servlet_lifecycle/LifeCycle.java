package servlet_lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LifeCycle extends HttpServlet
{
//	1st phase
	public LifeCycle() {
		System.out.println("1st phase executed...");
	}
	
//	2nd phase
	@Override
		public void init() throws ServletException {
			System.out.println("2nd phase executed...");
		}
	
//	3rd phase
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name");
			System.out.println(name);
				
				PrintWriter pw=resp.getWriter();
				pw.println("<html><body>"
						+ "<form action=two method=post>"
						+ "<button>Submit</button>"
						+ "</form>"
						+ "</body></html>");
				
			System.out.println("3rd phase executed..");
		}
	
//	4th phase
	
	@Override
		public void destroy() {
			System.out.println("4th phase executed...");
		}

}
