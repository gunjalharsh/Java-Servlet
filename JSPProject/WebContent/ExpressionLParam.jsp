<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgrey" text="Red">
<center>
<h1> Expression Language Param Program </h1>
</center>

<h1>

Name: ${param.a1}
<br>

<p>

Location: ${paramValues.c1[0]}
${paramValues.c1[1]}

<br>

Gender :

${paramValues.b1[0]}
${paramValues.b1[1]}

</h1>


</body>
</html>