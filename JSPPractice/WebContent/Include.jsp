<body bgcolor ="lightgrey" text="red">
<%@ include file="FirstJSP.jsp"%>

<h1>Data from Includefile....</h1>

<jsp:include page="Inc1.jsp"/>


<jsp:include page="Inc1.jsp">
<jsp:param name="Company" value="Cognizant"/>
<jsp:param name="Time" value="9.00 AM-6.00PM"/>
</jsp:include>





</body>