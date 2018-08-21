package com.sunil.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.sunil.domain.ProductCategory;
import com.sunil.service.ProductCategoryServiceImpl;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends BaseServlet {
	private static final long serialVersionUID = 1L;

	static final String UPLOAD_DIR = "/home/sunil/codebase";

	public AddProduct() {
		super();
	}
	ProductCategoryServiceImpl psImpl = new ProductCategoryServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection connection = getConnection();
		try {
			
			List<ProductCategory> listOfpCategory = psImpl.getListOfpCategory(connection);

			request.setAttribute("productCategories", listOfpCategory);

			connection.close();
		} catch (Exception e) {
		}

		request.getRequestDispatcher("add_product.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productCode = null;
		String productDiscription = null;
		String productPrice = null;
		String categoryName = null;
		Connection connection = getConnection();
		int categoryId=0;
		File filePath=null;
		if (ServletFileUpload.isMultipartContent(request)) {
			try {

				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				for (FileItem item : multiparts) {
					if (!item.isFormField()) {

						filePath = new File(UPLOAD_DIR + File.separator + item.getName());
						item.write(filePath);
					} else {
						if (item.getFieldName().equals("product_code")) {
							productCode = item.getString();
						} else if (item.getFieldName().equals("category_name")) {
							categoryName = item.getString();
							categoryId=Integer.parseInt(categoryName);

						} else if (item.getFieldName().equals("product_price")) {
							productPrice = item.getString();

						} else if (item.getFieldName().equals("product_discription")) {
							productDiscription = item.getString();

						}
					}
				}
			} catch (Exception ex) {
				request.setAttribute("message", "File Upload Failed due to " + ex);
			}

		}

		

		try {
			String sql = "insert into product(p_code,p_description,p_price,p_category_id,p_path) values(?,?,?,?,?)";

			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, productCode);
			ps.setString(2, productDiscription);
			ps.setDouble(3, Double.parseDouble(productPrice));
			ps.setInt(4, categoryId);
			ps.setString(5, filePath.getAbsolutePath());
			

			ps.executeUpdate();

			
		} catch (Throwable ex) {
			System.out.println(ex.getCause());
		}
		
		List<ProductCategory> listOfpCategory=null;
		try {
			listOfpCategory = psImpl.getListOfpCategory(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("productCategories", listOfpCategory);
		request.getRequestDispatcher("add_product.jsp").forward(request, response);
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
