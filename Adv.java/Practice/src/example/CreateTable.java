package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/practice";
		String user="root";
		String pwd="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, pwd);
			Statement st=con.createStatement();
			boolean b=st.execute("create table student(id int,name varchar(20),age int,email varchar(20),pwd varchar(10))");
			System.out.println(b);
			System.out.println("Created.........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
