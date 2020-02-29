package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/index1")
public class index1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public index1() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Num1 =request.getParameter("text1");
		String Num2 =request.getParameter("text2");
		PrintWriter out=response.getWriter();
		
		out.print("Num1 :"+Num1+" "+"Num2 :"+Num2);
		
	}

}
