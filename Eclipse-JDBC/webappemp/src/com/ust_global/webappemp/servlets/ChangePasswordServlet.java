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

import com.ust_gloabl.webappemp.util.EmployeeDaoManager;
import com.ust_global.webappemp.dao.EmployeeDAO;
import com.ust_global.webappemp.dto.EmployeeInfo;

@WebServlet("/change")
public class ChangePasswordServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		
		if(session != null) {
			
			String pass = req.getParameter("pass");
			String confirmPass = req.getParameter("confirmpassword");
			
			if(pass.equals(confirmPass)) {
			
				EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(),pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
				
			}else {
				String msg = "Password not matching!!";
				req.setAttribute("msg", msg);
							
				RequestDispatcher dispatcher = req.getRequestDispatcher("/change.jsp");
				dispatcher.forward(req, resp);
			}
			
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Login.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
