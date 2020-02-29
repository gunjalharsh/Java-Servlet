

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Session2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg;
		HttpSession session = request.getSession();//request.getSession(true);
	    if(session.isNew())
	    {
	      session.setAttribute("f", new int[] { 0 });
	      session.setAttribute("b", new int[] { 0 });
	    }
	    int[] foo1 = (int[])session.getAttribute("f");
	    int[] bar1 = (int[])session.getAttribute("b");
	    if(request.getParameter("foo") != null)
	    {
	      foo1[0]++;
	      msg = "Bought a PEPSI. You now have "+foo1[0]+".";
	    }
	    else if(request.getParameter("bar") != null)
	    {
	      bar1[0]++;
	      msg = "Bought a SLICE. You now have "+bar1[0]+".";
	    }

	    else if(request.getParameter("buy") != null)
	    {
	      session.invalidate();//destroy the session
	      //session can be invalidated only once
	    //session.invalidate();//IllegalStateException

	      msg = "Your order for "+foo1[0]+" PEPSI'S and "+bar1[0]+
		" SLICE'S has been accepted. Your shopping cart is empty now.";
	    }
	    else
	    {
	      msg = "You have "+foo1[0]+" PEPSI'S and "+bar1[0]+
		" SLICE'S in your shopping cart.";
	    }
	    
	    PrintWriter out = response.getWriter();
	    out.print("<h1>"+msg);
out.print("<hr><a href='Session1'>Back to the Shop</a></body></html>");
	}

}
