package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunil.domain.ProductCategory;
import com.sunil.service.ProductCategoryServiceImpl;

/**
 * Servlet implementation class ProductCategories
 */
@WebServlet("/ProductCategories")
public class ProductCategories extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductCategories() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection connection = getConnection();
		try {
			ProductCategoryServiceImpl psImpl = new ProductCategoryServiceImpl();
			List<ProductCategory> listOfpCategory = psImpl.getListOfpCategory(connection);
				
			
			request.setAttribute("productCategories",listOfpCategory );

			
			connection.close();
		} catch (Exception e) {
		}

		request.getRequestDispatcher("productCategories.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
