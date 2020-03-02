package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.POJO;


@WebServlet("/bussinesslogic")
public class bussinesslogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public bussinesslogic() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		POJO obj=new POJO();
		PrintWriter pw=response.getWriter();
		
		obj.setName(request.getParameter("name"));
		obj.setPhone(request.getParameter("phone"));
		
		String name=obj.getName();
		String phone=obj.getPhone();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","admin");
			
			pw.print("connected");
			
			PreparedStatement ps=con.prepareStatement("INSERT into Emp(Emp_name,Emp_phone) values(?,?);");
			
			ps.setString(1, name);
			ps.setString(2, phone);
			
			int x=ps.executeUpdate();
			
			if(x==1) {
				pw.println("Data Entered Successfully!!!!!");
			}else {pw.println("not entered please check again.");}
			
		} catch (ClassNotFoundException | SQLException e) {
			pw.print("Data Error");
		
		
		}
		
	}
}
