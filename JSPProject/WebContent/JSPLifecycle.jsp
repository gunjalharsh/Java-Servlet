<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey" text="Red">

<center>
<h1>  JSP LifeCycle  </h1>
</center>



<%!
int counter =0;
public void jspInit()
{
	System.out.println("Init Method");
}

%>
<br>
<%
for(int i=0;i<100;i++){%>
<%

System.out.println("Service Method");
counter++;
%>
<%} %>
<br>
<h2>
JSP LifeCycle :Request Counter
</h2>

<p> This Page has been called <%=counter %> times.</p>

<%!
public void jspDestroy(){
	
	System.out.println("Destroy Method");
}

%>


</body>
</html>