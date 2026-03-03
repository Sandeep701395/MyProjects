package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps?user=root&&password=root");
		Statement st=con.createStatement();
		int i=st.executeUpdate("delete from emp where id=101");
		System.out.println(i);
		System.out.println("Delete Record.....");
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
