package com.shop;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String forward=request.getParameter("forward");
	 if(forward.equals("login")){
		 RequestDispatcher rd=request.getRequestDispatcher("LoginServlet");  
	        rd.forward(request, response);
	 }
	 if(forward.equals("addcs")){
		 System.out.println("in controller");
		 RequestDispatcher rd=request.getRequestDispatcher("AddBooks");  
	        rd.forward(request, response);
	 }
	 if(forward.equals("addhistory")){
		 System.out.println("in controller");
		 RequestDispatcher rd=request.getRequestDispatcher("ShowCart");  
	        rd.forward(request, response);
	 }
	 
 }
}
