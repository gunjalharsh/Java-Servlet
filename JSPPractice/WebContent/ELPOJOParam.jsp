
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey" text="Red"/>

<center>
<h1> Expression Langauage mixed with  JSP</h1>
</center>


<jsp:useBean id="b1" class="com.cts.Product" scope="request"/>

<jsp:setProperty property="productname" name="b1" value ="${param.pname }"/>
<jsp:setProperty property="productno" name="b1"  value ="${param.pno }"/>

<h1>
<p> Pno (Using EL) : ${b1.productno}
<p> Pno (Using Getter)  : <%=b1.getProductno()  %>
<p> Pno (Using GetProperty) : <jsp:getProperty property="productno" name="b1"/>
<p> PName :${b1.productname }



</h1>

</body>
</html>