package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProduct")
public class DeleteProduct extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public DeleteProduct() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("productId");
		int productId = Integer.parseInt(id);

		Connection connection = getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement("delete from product where id = ? ");

			ps.setInt(1, productId);

			ps.executeUpdate();

			connection.close();
		} catch (Exception ex) {
		}

		response.sendRedirect(request.getContextPath() + "/Products");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
