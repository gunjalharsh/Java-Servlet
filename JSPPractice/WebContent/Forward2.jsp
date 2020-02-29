<%

if((request.getParameter("a1")).equals("Harshal")){
	
%>

<jsp:forward page="For1.jsp">
<jsp:param name="user" value="**Welcome User**"/>

</jsp:forward>

<%
}
else{
	%>
	
	<jsp:forward page="For2.jsp">
	
	<jsp:param name="user1" value="Invalid User"/>
	</jsp:forward>

<%

}
%>