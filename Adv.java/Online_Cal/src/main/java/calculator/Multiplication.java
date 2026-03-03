package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Multiplication extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt( req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int mul=num1*num2;
		
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>"
				+ "<h1>Multiplication Of "+num1+" and "+num2+" is :"+mul+"</h1>"
				+ "<h2> To Get Cube Click On Cube Button</h2>"
				+ "<form action=cub> "
				+ "<button>Cube</button>"
				+ "</form></body></html>");
		
		HttpSession hs=req.getSession();
		hs.setAttribute("a", mul);
	}
}
