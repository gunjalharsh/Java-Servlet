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

@WebServlet("/UserName")
public class UserName extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter pw = response.getWriter();
			
			String n=request.getParameter("EMP-id");
			
			String p=request.getParameter("EMP-Name");
			
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/servlet";
			String username="root";
			String password="admin";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			pw.println("connected ok..");
			
			
			PreparedStatement ps=con.prepareStatement("insert into uname values (?,?)");
			
			ps.setString(1, n);
			ps.setString(2, p);
		
			
			int i=ps.executeUpdate();
			
			if(i>0)
			{
				pw.print("Registered");
			}
			
			
			
		} catch (SQLException | ClassNotFoundException e) {
			
		}

		
		
	}
}
