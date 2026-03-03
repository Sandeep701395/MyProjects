package entertainment_project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OttPlatform extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=req.getParameter("action");
		switch(action)
		{
		case "youtube":
		{
			resp.sendRedirect("https://www.youtube.com");
		}
		break;
		case "netflix":
		{
			resp.sendRedirect("https://www.netflix.com");
		}
		break;
		case "primevideo":
		{
			resp.sendRedirect("https://www.primevideo.com");
		}
		break;
		case "Zee5":
		{
			resp.sendRedirect("https://www.zee5.com");
		}
		break;
		case "hotstar":
		{
			resp.sendRedirect("https://www.hotstar.com");
		}
		break;
		case "jiotv":
		{
			resp.sendRedirect("https://www.jiotv.com");
		}
		break;
		default:
		{
			System.out.println("Invalid option...");
		}
		}
	}

}
