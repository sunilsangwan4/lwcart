package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Registration")
public class UserRegistration extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("userName");
		String userPassword  = request.getParameter("userPassword");
		String userEmail= request.getParameter("userEmail");
	
		String userConfirmPassword  = request.getParameter("userConfirmPassword");

		if (!userPassword.equals(userConfirmPassword)) {

			
			
			request.setAttribute("error"," password and confirm password does not match ");
			request.getRequestDispatcher("userRegistration.jsp").forward(request, response);
		
			

		}

		Connection connection = getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement("insert into REGISTERUSER values(?,?,?)");

			ps.setString(1, username);
			ps.setString(2, userPassword);
			ps.setString(3, userEmail);
			

			ps.executeUpdate();

			connection.close();
		} catch (Exception ex) {
		}
			response.sendRedirect("userLogin.jsp");
	}
}
