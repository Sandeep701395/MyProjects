package jdbc_steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_steps?user=root&&password=root");
			Statement st=con.createStatement();
			int i=st.executeUpdate("update emp set name='Giri' where id=101");
			System.out.println(i);
			int i1=st.executeUpdate("update emp set name='Ram',sal=20000 where id=102");
			System.out.println(i1);
			System.out.println("Record Updated...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
