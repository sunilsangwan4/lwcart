package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("userEmail");
		String pass = request.getParameter("userPassword");

		Connection connection = getConnection();
		String userName=null;
		try {
			PreparedStatement ps = connection.prepareStatement("select * from REGISTERUSER where EMAIL=? and PASS =?");

			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			boolean isUserValid = false;
			
			while (rs.next()) {
				userName =rs.getString(1) ;
				isUserValid = true;
				break;
			}

			if (isUserValid) {
				response.sendRedirect("welcome.jsp");
				HttpSession session=request.getSession();
				session.setAttribute("userName", userName);
			} else {
				request.setAttribute("error","Inavlid Username/Paasword");
				request.getRequestDispatcher("userLogin.jsp").forward(request, response);
			
			
			}

			connection.close();
		} catch (Exception ex) {
		}
		
		

	}

}
