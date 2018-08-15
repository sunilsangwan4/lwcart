package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		try {
			PreparedStatement ps = connection
					.prepareStatement("select * from REGISTERUSER where EMAIL=? and PASS =?");

			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			boolean isUserValid = false;

			while (rs.next()) {
				isUserValid = true;
				break;
			}

			if (isUserValid) {
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("login.jsp");
			}

			connection.close();
		} catch (Exception ex) {
		}

	}

}
