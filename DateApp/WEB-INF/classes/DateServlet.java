package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;


public class DateServlet extends GenericServlet {

	

	public void service(ServletRequest req , ServletResponse res)throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=null; //print writer 
		
		Date date = null; //date var
		
		res.setContentType("text/html"); //set content 
		
		pw = res.getWriter(); // 
		
		date = new Date();

		pw.println(" This is Hashcode "+this.hashCode());

		try{
		Thread.sleep(5000);
		}catch(Exception e){ }
		
		
		
		pw.close();
	
	}//service
	
	
}//class
