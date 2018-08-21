package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunil.domain.Product;
import com.sunil.service.ProductServiceImpl;

@WebServlet("/Products")
public class Products extends BaseServlet {
	private static final long serialVersionUID = 1L;

	public Products() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection = getConnection();
	try {
		
	
		ProductServiceImpl pImpl = new ProductServiceImpl();
		List<Product> listOfProduct = pImpl.getListOfProduct(connection);
		

		request.setAttribute("products",listOfProduct );
		connection.close();
	
	}
	catch (Exception ex) {
		
	}
	
	request.getRequestDispatcher("products.jsp").forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
