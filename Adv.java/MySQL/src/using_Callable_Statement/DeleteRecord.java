package using_Callable_Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecord 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/sample";
		String user="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			String s="delete from emp where  id=?";
			CallableStatement cs=con.prepareCall(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			cs.setInt(1, id);
			int i=cs.executeUpdate();
			System.out.println(i+" Record Deleted.......");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
