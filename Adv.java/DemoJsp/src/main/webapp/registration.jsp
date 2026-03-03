<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	int age=Integer.parseInt(request.getParameter("age"));
	String email=request.getParameter("email");
	String pwd=request.getParameter("pwd");
	double salary=Double.parseDouble(request.getParameter("salary"));
	String location=request.getParameter("location");
	long phno=Long.parseLong(request.getParameter("phno"));
	
	String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
	Connection con=null;
	PreparedStatement pre =null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url, user, password);
		pre=con.prepareStatement("insert into emp1 values(?,?,?,?,?,?,?,?)");
		pre.setInt(1,id);
		pre.setString(2,name);
		pre.setInt(3, age);
		pre.setString(4, email);
		pre.setString(5, pwd);
		pre.setDouble(6, salary);
		pre.setString(7, location);
		pre.setLong(8, phno);
		
		int i=pre.executeUpdate();
		if(i>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h1 style='color:red'>Registration is Failed!!!<h1>");
		}


%>
</body>
</html>