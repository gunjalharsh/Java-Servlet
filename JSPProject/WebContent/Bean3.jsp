<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="lightgrey" text="Red">

<h1> Java Bean Details</h1>
<jsp:useBean id="b1" class="com.cts.Product" scope="session" />

<h1>

<jsp:getProperty property="productno" name="b1"/>
<jsp:getProperty property="productname" name="b1"/>
</h1>

</body>
</html>