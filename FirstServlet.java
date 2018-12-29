package org.preek.com;
import java.sql.*;
import java.util.Scanner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FirstServlet extends GenericServlet
{

	 public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
	  {
		  String Source=req.getParameter("nm");
		  String Destination=req.getParameter("pl");
		  PrintWriter out=resp.getWriter();
		  jdbc j=new jdbc();
		  out.println("<html><body bgcolor='yellow'>"+"<h1>saved"+"</h1>"+"</body></html>");
		  j.jdbc_con();
		  out.flush();
		  out.close();
		  
	  }
	 
		

}
