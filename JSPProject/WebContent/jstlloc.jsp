<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgrey" text="Red">

 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cts"%>
 <cts:set var="loc" value="pune"/>
 <cts:if test="${loc=='pune' }" var="b">
 <p> My Location is
 <cts:out value="${loc }" ></cts:out>
 <p> Result : <cts:out value="${b }"></cts:out>
 
 </cts:if>
 
 
 
 
 

</body>
</html>