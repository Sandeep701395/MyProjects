package online_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(req.getParameter("number1"));
		int num2=Integer.parseInt(req.getParameter("number2"));
		int sum=num1+num2;
		PrintWriter pw=resp.getWriter();
//		pw.println("<h1 style=color:greenyellow;> Sum of "+num1+" and "+num2+ " is :" +sum+"</h1>"
//				+"To Get Square Click On Square Button"
//				+ "<form action='sq'>"
//				+ "<input type='hidden' name='a' value="+sum+">"
//				+ "<button>Square</button>"
//				+ "</form>");
		
		
		
//		1st way-----------
		
//		RequestDispatcher rd=req.getRequestDispatcher("sq?a="+sum);
//		rd.forward(req, resp);
		
		
//		2nd way------------
//		req.setAttribute("a", sum);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, resp);
		
//		4th way
		pw.println("<h1 style=color:greenyellow;> Sum of "+num1+" and "+num2+ " is :" +sum+"</h1>"
				+"To Get Square Click On Square Button"
				+ "<form action='sq'>"
				+ "<button>Square</button>"
				+ "</form>");
		HttpSession hs=req.getSession();
		hs.setAttribute("a", sum);
	}

}
