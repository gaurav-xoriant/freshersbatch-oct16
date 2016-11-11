package com.shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddBooks")
public class AddBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<String>bookList=new ArrayList<>();
		System.out.println("in add books");
		String books[]=request.getParameterValues("cs_books");
		for(int i=0;i<books.length;i++){
			bookList.add(books[i]);
		}
		
		session.setAttribute("books",bookList);
		Iterator<String>itr=bookList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		response.sendRedirect("AddBooksHistory.html");
	}
}
