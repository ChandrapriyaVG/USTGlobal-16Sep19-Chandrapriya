package com.ust_global.webappemp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
	if(cookies != null) {
		for (Cookie cookie : cookies) {
		
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("ID: <input type='number' name='id' value='"+id+"'>");
		out.println("PASSWORD: <input type='password' name='password'>");
		out.println("<input type='checkbox' name='Remember' value='checked'>Remember Me!!<br>");
		out.println("<input type='submit' value='Login'>");
		out.println("<input type='reset' name='Reset'>");
		out.println("</form>");
		out.println("<a href='./register.html'>Click here to Register!</a>");
		out.println("</fieldset>");
		out.println("</body>");
		out.println("</html>");
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	
	}
}
