<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body  bgcolor="lightgrey" text="Black">


<h1> Java Bean Details</h1>

<jsp:useBean id="s1" class="com.cts.Product" scope="request" />

<jsp:setProperty property="productno" name="s1" value="5006"/>
<jsp:setProperty property="productname" name="s1" value="HP Laptop"/>

<h1>

PNo:

<jsp:getProperty name="s1" property="productno"/>

PName:


<jsp:getProperty name="s1" property="productname"/>

</h1>





</body>
</html>