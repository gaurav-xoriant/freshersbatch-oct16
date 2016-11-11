package com.shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String uname=request.getParameter("uname");
		System.out.println(session.isNew());
		System.out.println(uname);
		session.setAttribute("uname", uname); //state of the client
		String uname1=request.getParameter("uname");
		String pswd=request.getParameter("pswd");
		if(uname1.equals(pswd)){
			System.out.println("success");
			response.sendRedirect("Addbooks.html");
		}
		else{
			System.out.println("wrong username pswd");
		}
	}
}
