package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CubeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession hs=req.getSession();
		int a=(int) hs.getAttribute("a");
		int cube=a*a*a;
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>"
				+ "<h1> Cube Is:"+cube+"</h1>"
				+ "<h4>To Get Division Click On Divide Button</h4>"
				+ "<form action=div method=post>"
				+ "<button>Divide</button>"
				+ "</form></body></html>");
		hs.setAttribute("b", cube);
	}

}
