package com.amulya.learnjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
 @WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServlet" }) 
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter pw=response.getWriter();
		System.out.println("hello from doget");
		pw.println("<h3> Hello from doget </h3>");
		
	}

}
