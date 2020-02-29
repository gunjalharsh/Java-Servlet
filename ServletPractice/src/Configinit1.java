

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/Configinit1" }, 
		initParams = { 
				@WebInitParam(name = "Company", value = "CTS"), 
				@WebInitParam(name = "Venue", value = "Chennai")
		})
public class Configinit1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Configinit1() {
        super();
    }

    String v1,t1;
   	public void init(ServletConfig config) 
   			throws ServletException
   	{
   		super.init(config);
   		v1=config.getInitParameter("Company");
   		 t1=config.getInitParameter("Venue");
   		
   	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		  ServletConfig con1 = getServletConfig();
	        out.println("Company:" + con1.
	        		getInitParameter("Company"));
	        out.println("Venue:" +con1.
	        		getInitParameter("Venue"));
	        out.println("<h1>Venue: "+t1);
			    out.println("<h1>Company: "+v1);	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
