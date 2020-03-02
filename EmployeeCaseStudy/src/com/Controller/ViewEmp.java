package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewEmp")
public class ViewEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","admin");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Emp");
			
			 out.println("<hr></br><table cellspacing='0' cellpadding='5' border='1'>");
			   out.println("<tr>");
			   out.println("<td><b>Emp_name</b></td>");
			   out.println("<td><b>Emp_phone</b></td>");
			   out.println("</tr>");
			
			if(rs.next()==false)
				out.print("No records available");
			else {
				while(rs.next()) {
			
					   out.println("<tr>");
					    out.println("<td>"+rs.getString(1) + "</td>");
					    out.println("<td>"+rs.getInt(2) + "</td>");
					    out.println("</tr>");
					
		
				}
			}
			
			
		}catch(Exception e) {
			out.print(e);
		}
	}

}
