package online_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		int a=Integer.parseInt(req.getParameter("a"));
//		int a= (int) req.getAttribute("a"); it is used 2nd way
		
		HttpSession hs=req.getSession();
		int a=(int) hs.getAttribute("a");
		int sqr=a*a;
		
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>"
				+ "<h1> Sum Of Square is: "+sqr+"</h1>"
				+ "<h3>To Get Division Click On Division Button</h3>"
				+ "<form action=div method=post>"
				+ "<button>Division</button>"
				+ "</form></body></html>");
		hs.setAttribute("b", sqr);
	}
}
