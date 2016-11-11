package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Override
     public void init() throws ServletException {
         String driverclass = getInitParameter("driverclass");
         String name = getServletContext().getInitParameter("name");
     }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String paswd=request.getParameter("pswd");
		String driver=getServletConfig().getInitParameter("driverclass");
		System.out.println("in servlet");
		if(username.equals(paswd)){
			System.out.println("in if");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body><h1>WELCOME "+username+"    "+driver+"</h1></body></html>");
		}
		else{
			PrintWriter pw=response.getWriter();
			pw.println("<html><body><h1>Wrong username and password</h1></body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
