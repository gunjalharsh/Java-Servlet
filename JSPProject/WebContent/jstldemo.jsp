<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cts"%>

<cts:out value ="COGNIZANT"/>

<cts:out value="Hello World.."/>


<!-- jstl contains EL TAG -->

 <cts:out value="${a }"></cts:out>

 <cts:forEach var="n" begin="10" end="100" step="5">

 <cts:out value="${n}"/><br>

 </cts:forEach>


</body>
</html>