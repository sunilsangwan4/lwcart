package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunil.domain.ProductCategory;
import com.sunil.service.ProductCategoryServiceImpl;

/**
 * Servlet implementation class BrowseProducts
 */
@WebServlet("/BrowseProducts")
public class BrowseProducts extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BrowseProducts() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Connection connection = getConnection();
		try {
			ProductCategoryServiceImpl psImpl = new ProductCategoryServiceImpl();
			List<ProductCategory> listOfpCategory = psImpl.getListOfpCategory(connection);
				
			
			request.setAttribute("productCategories",listOfpCategory );

			
			connection.close();
			request.getRequestDispatcher("browse_product.jsp").forward(request, response);
		} catch (Exception e) {
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
