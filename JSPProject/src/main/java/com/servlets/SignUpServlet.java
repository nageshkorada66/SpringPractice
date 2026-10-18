package com.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		//req.setAttribute("name", userName);
		ServletContext servletContext = req.getServletContext();
		servletContext.setAttribute("name", userName);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("pass", password);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(req, resp);
	}
}
