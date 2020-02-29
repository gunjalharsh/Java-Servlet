<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgrey" text="Red">

<h1>
Java Bean details
</h1>

<jsp:useBean class="com.cts.Product" id="b1" scope="session"/>

<jsp:setProperty name="b1" property="productno" param="a1"/>
<jsp:setProperty name="b1" property="productname" param="b1"/>

<h1>PNo:

<jsp:getProperty name="b1" property="productno" />
<h1>PName : <jsp:getProperty property="productname" name="b1"/>   </h1>

<a href="Bean3.jsp">Next Page</a>


</body>
</html>