<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="javax.xml.ws.Response"%>
<%@page import="org.omg.CORBA.Request"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.Model.POJO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightblue" text="black">



<%

PrintWriter out1 = response.getWriter();


String name = (String)request.getAttribute("name");

String phone = (String)request.getAttribute("phone");


if(phone!=null){
out1.print("Requested Data = "+phone);
}
else if(name!=null || !name.isEmpty()){
	out1.print("Requested Data = "+name);
}
else if(phone==null && (name==null||name.isEmpty())){
	out1.print("Requested Data Not in Records");
	}

%>

</body>
</html>