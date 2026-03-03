package emp_management;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        String url = "jdbc:mysql://localhost:3306/employee_management";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement("delete from emps where id=?");
            ps.setInt(1, id);

            ps.executeUpdate();

            con.close();

            // Redirect back to employee list
            resp.sendRedirect("empdetails");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}