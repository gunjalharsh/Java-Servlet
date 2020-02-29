

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hidden1
 */
@WebServlet("/Hidden1")
public class Hidden1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hidden1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		out.println("<h1>First Hidden: "+request.
				   getParameter("com_name"));
		   out.println("Second Hidden: "+request.
				   getParameter("location"));
		   	//doget calls dopost
		   out.println("<form method=post "
		   		+ "action=Hidden1>");
		   out.println("<input type=hidden"
		   		+ " name=training value=Java>");
		   out.println("<input type=hidden "
		   		+ "name=Qualification value=B.E>");
		   out.println("<input type=submit value=View>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
		
	    out.println("<h1>Third Hidden: "+request.
	    		getParameter("training"));
out.println("Fourth Hidden: "+request.
		getParameter("Qualification"));
	}

}
