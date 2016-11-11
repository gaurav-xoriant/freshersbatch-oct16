package com.shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowCart")
public class ShowCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("in show cart");
		String books[]=request.getParameterValues("h_books");
		List<String>totalBooks=new ArrayList<>();
		totalBooks=(List<String>) session.getAttribute("books");
		for(int j=0;j<books.length;j++){
			totalBooks.add(books[j]);
		}
		session.setAttribute("books",totalBooks);
		Iterator<String>itr=totalBooks.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
