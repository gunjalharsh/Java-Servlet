

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dispatcher
 */
@WebServlet("/Dispatcher")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Dispatcher() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno1= request.getParameter("e1");
		String name1= request.getParameter("n1"); 
		String salary1= request.getParameter("s1");
		String dept1= request.getParameter("d1");

		//setattribute(attributename,attributevalue)
		request.setAttribute("Employeenumber", eno1);//attributename,attributevalue
		request.setAttribute("Empname", name1);
		request.setAttribute("Salary", salary1);
		request.setAttribute("Depart", dept1);

		ServletContext context= getServletContext();
		RequestDispatcher rd= context.
				getRequestDispatcher("/Dispatcher4");
		rd.forward(request, response);
	}

}
