package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DivisionSevlet extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=req.getSession();
		int b=(int) hs.getAttribute("b");
		int div=b/0;
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>"
				+ "<h1>Division is:"+div+"</h1>"
				+ "</body></html>");
	}

}
