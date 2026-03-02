<%@page import="java.sql.ResultSet"%>
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
		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		
		String url="jdbc:mysql://localhost:3306/employee_management",user="root",password="root";
		Connection con=null;
		PreparedStatement pre =null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			pre=con.prepareStatement("select * from emp1 where email=? and pwd=?");
			pre.setString(1, email);
			pre.setString(2, pwd);
			ResultSet rs=pre.executeQuery();
			if(rs.next())
			{
				HttpSession hs=request.getSession();
				hs.setAttribute("email", email);
				 RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
				rd.forward(request, response); 
				/* response.sendRedirect("homepage.jsp"); */
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
				out.println("<h1 style='color:red'>Invalid Email Or Password !!!<h1>");
			}
	
	%>
</body>
</html>