

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session1")
public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Session1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("Session Practice");
		
		HttpSession session=request.getSession(false);
		
		out.println("Session Value :" +session);
		
		out.print("<center><BODY bgcolor=lightblue><h1><I>Online Shopping</I></h1></center>");
	    out.print("<FORM METHOD=\"post\" ACTION=\"Session2\" ><INPUT TYPE=\"SUBMIT\" NAME=\"foo\" VALUE=\"PEPSI\"><INPUT TYPE=\"SUBMIT\" NAME=\"bar\" VALUE=\"SLICE\"><INPUT TYPE=\"SUBMIT\" NAME=\"see\" VALUE=\"Cart\"><INPUT TYPE=\"SUBMIT\" NAME=\"buy\" VALUE=\"Buy\">");
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
