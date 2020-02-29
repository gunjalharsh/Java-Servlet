package com.CTS.GenericDemos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/GenericDemo1")
public class GenericDemo1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       

    public GenericDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		
		String User=request.getParameter("u1");
		String Password =request.getParameter("p1");
		String Gender =request.getParameter("gender");
		
		out.println("<h1>UserName :"+User + "Password :"+Password+ "Gender :"+Gender);
		
		
	
		
		String[] lang=request.getParameterValues("c1");
		
		for(int i=0;i<lang.length;i++)
		{
			out.println("language :" +lang[i]);
			
		}
		
String[] quali=request.getParameterValues("s1");
		
		for(int i=0;i<lang.length;i++)
		{
			out.println("Qualifications :" +quali[i]);
			
		}
	
		
	}

}
