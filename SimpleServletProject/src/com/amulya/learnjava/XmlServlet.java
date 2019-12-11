package com.amulya.learnjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String userName=request.getParameter("userName");
		pw.println("hello from get method "+userName);
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		if(userName!= ""&&userName!=null){
		session.setAttribute("savedUserName", userName);
		context.setAttribute("savedUserName", userName);
		}
		pw.println("hello from session object "+(String)session.getAttribute("savedUserName"));
		pw.println("hello from context object "+(String)context.getAttribute("savedUserName"));
		
	}
	
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		pw.println("hello from post method  and we know your full name "+firstName +" "+lastName);
		String profession=request.getParameter("prof");
		pw.println("you are a "+profession);
		String[] location=request.getParameterValues("location");
		pw.println("and you are from " +location.length);
		for(int i=0;i<location.length;i++){
			pw.println("places are "+location[i]);
		}
	}
	*/
	

}
