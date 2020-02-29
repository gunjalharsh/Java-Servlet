<%@ page errorPage="UserError.jsp"%>
<% 

int a=Integer.parseInt(request.getParameter("a1"));
int b=Integer.parseInt(request.getParameter("b1"));

out.println("<h1> Answer :"+a/b);
%>
