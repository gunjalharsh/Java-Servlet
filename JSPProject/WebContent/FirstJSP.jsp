<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><center><b>First JSP Program</b></center></title>
</head>
<body>

<body bgcolor =lightblue>
<%
out.println("First JSP Program");
%>
<br>
<%!
int a=10;
int b=20;
int sum=0;

%>

Sum :<%= sum=a+b %>
<br>
<%
ArrayList l=new ArrayList();
l.add(10);
l.add("Harshal");
l.add("Hari");
l.add("Kartik");
l.add("Sayan");



%>
<br>
<jsp:scriptlet>
out.println("List is :" +l);
</jsp:scriptlet>


</body>
</html>