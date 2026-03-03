package send_redirect_programs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loging")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		
		if(email.equals("ram@gmail.com") && pwd.equals("ram123"))
		{
			resp.sendRedirect("https://www.youtube.com");
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}

}
