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
public class Registration extends BaseServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");
		String e = request.getParameter("userEmail");
		String c = request.getParameter("userCountry");
		String p1 = request.getParameter("userPass1");

		if (!p.equals(p1)) {

			response.sendRedirect("index.jsp");

		}

		Connection connection = getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement("insert into REGISTERUSER values(?,?,?,?)");

			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);
			ps.setString(4, c);

			ps.executeUpdate();

			connection.close();
		} catch (Exception ex) {
		}
			response.sendRedirect("login.jsp");
	}
}
