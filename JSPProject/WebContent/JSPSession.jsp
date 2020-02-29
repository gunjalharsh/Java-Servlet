<%@ page session="true"
%>

<%

out.println("Session Object :"+session);

String userName=request.getParameter("n1");
String Password =request.getParameter("n2");

session.setAttribute("SessionUser", userName);
session.setAttribute("SessionPassword", Password);
out.println("<h1> Welcome "+userName +"!");
out.println("<a href=JSPSession1.jsp>Next Page</a>");

%>