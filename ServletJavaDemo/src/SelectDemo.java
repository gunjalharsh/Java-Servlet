

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SelectDemo() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw=response.getWriter();
			String url = "jdbc:mysql://localhost:3306/servlet";
			String username="root";
			String password="admin";
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, username, password);
			@SuppressWarnings("unused")
			Statement sc =con.createStatement();
			  pw.println("<table border=6 bgcolor=pink " + "align=center bordercolor=red><tr><th>EId</th>" + "<th>EmpName</th></tr>");
			ResultSet rs=sc.executeQuery("select * from uname");  

			   while(rs.next())
		 	    {
		 	    pw.println("<tr>");
		 	    pw.println("<td>"+rs.getString(1));
		 	    pw.println("<td>"+rs.getString(2));
		 	    pw.println("</tr>"); 	 	
		 	    }
			  pw.println("</table>");
		 	    rs.close();
			
		
		
		
	}catch (SQLException | ClassNotFoundException e) {
		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
