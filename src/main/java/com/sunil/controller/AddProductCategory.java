package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddProductCategory")
public class AddProductCategory extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductCategory() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("add_product_category.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String categoryName = request.getParameter("category_name");
	

		if (categoryName==null) {

			request.setAttribute("error"," please enter category name ");
			request.getRequestDispatcher("add_product_category.jsp").forward(request, response);
		
		}

		Connection connection = getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement("insert into product_categories(category_name) values(?)");

			ps.setString(1, categoryName);

			ps.executeUpdate();

			connection.close();
		} catch (Exception ex) {
		}
		request.setAttribute("sucess"," product category has been added  ");
		request.getRequestDispatcher("add_product_category.jsp").forward(request, response);
	}

}
