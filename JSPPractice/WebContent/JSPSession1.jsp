<%
 
String username=(String) session.getAttribute("SessionUser");
String password=(String) session.getAttribute("SessionPassword");

out.println( "<h1> Welcome" +username);
out.println( "<h1> Your Password" +password);
session.invalidate();
%>
<a href=./JSPSession.html>Back </a>