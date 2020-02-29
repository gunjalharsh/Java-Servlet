

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestDispatcher1")
public class RequestDispatcher1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RequestDispatcher1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		ServletContext sc = getServletContext();
		RequestDispatcher dis = sc.getRequestDispatcher("/RequestDispatcher2");//relative path only allowed
		if (dis != null)
		{
		     dis.include(request, response);
		  //   dis.forward(request, response);
		}
		pw.println("<h1>Current Servlet1");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
