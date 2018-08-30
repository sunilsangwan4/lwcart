package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunil.domain.Product;
import com.sunil.service.ProductServiceImpl;

@WebServlet("/GetProduct")
public class GetProduct extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetProduct() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection = getConnection();
		try {
			String parameter = request.getParameter("categoryId");
			int categoryId = Integer.parseInt(parameter);

			ProductServiceImpl pImpl = new ProductServiceImpl();
			List<Product> listOfProduct = pImpl.getListOfProductByCategoryId(connection, categoryId);

			request.setAttribute("products", listOfProduct);
			connection.close();

		} catch (Exception ex) {

		}

		request.getRequestDispatcher("getproductbycategory.jsp").forward(request, response);
	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
