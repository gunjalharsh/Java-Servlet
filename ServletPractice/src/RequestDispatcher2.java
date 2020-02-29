

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatcher2")
public class RequestDispatcher2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RequestDispatcher2() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		//absolute and relative both allowed 
		/*	RequestDispatcher dis = request.
					getRequestDispatcher("/Jdbc1");//relative path only allowed
					if (dis != null)
					{
					     //dis.include(request, response);
					     dis.forward(request,response);
					}*/

	pw.println("<h1>Current Servlet2");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
