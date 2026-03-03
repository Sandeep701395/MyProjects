<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
*{
padding: 0;
margin: 0;
box-sizing: border-box;
}
#box1{
height: 50px;
width: 100%;
background-color: black;
border-radius:20px;
display: flex;
justify-content: space-evenly;
align-items: center;
}
a{
	color: white;
	text-decoration: none;
	font-size: 20px;
	font-weight: bold;
	cursor: pointer;
}

#add:hover{
background: linear-gradient(to bottom left ,pink,blue);
font-weight:bold;
font-size: 30px;
padding:5px 15px;
border-radius:20px;
color:black;
font-family: Verdana, Geneva, Tahoma, sans-serif;
}
#sub:hover{
background: linear-gradient(to top left ,green,yellow);
color: black;
padding:5px 15px;
border-radius:20px;
font-size: 30px;
font-family: Verdana, Geneva, Tahoma, sans-serif;
}
#mul:hover{
background: linear-gradient(gray,purple);
color: white;
padding:5px 15px;
border-radius:20px;
font-size: 30px;
font-family: Verdana, Geneva, Tahoma, sans-serif;
}
#div:hover{
background: linear-gradient(to bottom right,skyblue,red);
color: white;
padding:5px 15px;
border-radius:20px;
font-size: 30px;
font-family: Verdana, Geneva, Tahoma, sans-serif;
}
</style>
</head>
<body>

<nav>
<div id="box1">
<div><a href="index.jsp" id="add">Addition</a></div>
<div><a href="sub.jsp" id="sub">SubStraction</a></div>
<div><a href="mul.jsp" id="mul">Multiplication</a></div>
<div><a href="div.jsp" id="div">Division</a></div>
</div>

</nav>

</body>
</html>


