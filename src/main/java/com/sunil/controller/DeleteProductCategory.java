package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProductCategory")
public class DeleteProductCategory extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public DeleteProductCategory() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("categoryId");
		int categoryId = Integer.parseInt(id);

		Connection connection = getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement("delete from product_categories where id = ? ");

			ps.setInt(1, categoryId);

			ps.executeUpdate();

			connection.close();
		} catch (Exception ex) {
		}

		response.sendRedirect(request.getContextPath()+"/ProductCategories");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
