<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
</head>  
<body bgcolor="lightgrey" text="Red">  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/JDBC"  
     user="root"  password="admin"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from employee where emp_id>2;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>emp_id</th>  
<th>emp_name</th>  
  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.emp_id}"/></td>  
<td><c:out value="${table.emp_Name}"/></td>  
 
</tr>  
</c:forEach> 
 

</table> 