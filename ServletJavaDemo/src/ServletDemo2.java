

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletDemo2() {
        super();
    }

	@SuppressWarnings("rawtypes")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		out.print(" <h1 style=\"color:blue\"> Parameters names are :");
		Enumeration enumeration =getServletConfig().getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			
			out.print(enumeration.nextElement()+" ");
		}
		
		out.print("</h1>");
		ServletContext con1=getServletContext();
		
		out.print(" <h2 style=\"color:red\">Context parameters names are :</h2>");
		out.println("Company:" +con1.getInitParameter("Company"));
		out.println("<br/>Venue:" +con1.getInitParameter("Venue"));
		out.println("<br/>Training:" +con1.getInitParameter("Training")+"<br/>");
		
		
		out.print("<h3 style=\"color:red\"> Init parameters names are :</h3><br/>");
		out.println("\n");
		out.println(" Company:" +getServletConfig().getInitParameter("Company"));
		out.println(" <br/>Venue:" +getServletConfig().getInitParameter("Venue"));
		out.println(" <br/>Training:" +getServletConfig().getInitParameter("Training<br/>"));
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
