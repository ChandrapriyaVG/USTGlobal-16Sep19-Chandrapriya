package com.ust_global.webappemp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust_global.webappemp.dto.EmployeeInfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Login.jsp");
			dispatcher.forward(req, resp);
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}
}