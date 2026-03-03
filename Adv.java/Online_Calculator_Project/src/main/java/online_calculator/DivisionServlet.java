package online_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DivisionServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		try {
			HttpSession hs=req.getSession();
			int c=(int)hs.getAttribute("b");
			int div=c/0;
			
			pw.println("<html><body>"
					+ "<h1>Division is:"+div+"</h1>"
					+ "<h3>To Get Division Click On Zero Button:</h3>"
					+ "</body></html>");
		}catch(ArithmeticException e)
		{
			
			pw.println("<html><body>"
					+ "<h1 style='color:red;'>Error: Division by Zero is not Allowed</h1>"
					+ "</body></html>");
		}
		
	}
}
