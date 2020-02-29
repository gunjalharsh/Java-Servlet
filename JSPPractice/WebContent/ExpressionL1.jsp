
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="lightgrey" text="Red">
<center>
<h1> Expression Language Program </h1>
</center>

<h1>
${ 12+12}<br>
${6.0 ge 12 }<br>
${5<7 }<br>
${5 lt 7 }<br>

<!-- -EL Implicit Object -->

${header["host"] }<br>

${"I AM EXPRESSION LANGUAGE" }<br>
<%
session.setAttribute("Name","Mettukuppam");
%>

Sesssion Value :${sessionScope.Name}

</h1>

</body>
</html>