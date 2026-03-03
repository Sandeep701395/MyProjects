package callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="root";
		
	try {
		Connection con=	DriverManager.getConnection(url, user, password);
		String s="update demo set did=? where dname=?";
		CallableStatement cs=con.prepareCall(s);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		
		cs.setInt(1, id);
		cs.setString(2, name);
		cs.executeUpdate();
		System.out.println("Updated...");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
