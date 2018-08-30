package com.sunil.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunil.domain.Product;

public class ProductServiceImpl {

	public List<Product> getListOfProduct(Connection con) throws SQLException {

		PreparedStatement ps = con.prepareStatement(
				"select p.id,p.p_code,p.p_description,p.p_price,pc.category_name,p.p_path from product p, product_categories pc where p.p_category_id=pc.id");

		ResultSet rs = ps.executeQuery();

		List<Product> productList = new ArrayList<Product>();
		while (rs.next()) {
			Product listOfProduct = new Product();
			listOfProduct.setId(rs.getInt(1));
			listOfProduct.setpCode(rs.getString(2));
			listOfProduct.setpDiscription(rs.getString(3));
			listOfProduct.setpPrice(rs.getDouble(4));
			listOfProduct.setCategoryName(rs.getString(5));
			listOfProduct.setpPath(rs.getString(6));

			productList.add(listOfProduct);

		}

		return productList;

	}

	public List<Product> getListOfProductByCategoryId(Connection con, int categoryId) throws SQLException {

		PreparedStatement ps = con.prepareStatement(
				"select p.id,p.p_code,p.p_description,p.p_price,pc.category_name,p.p_path from product p, product_categories pc where p.p_category_id=pc.id and pc.id=?");
		ps.setInt(1, categoryId);
		ResultSet rs = ps.executeQuery();

		List<Product> productList = new ArrayList<Product>();
		while (rs.next()) {
			Product listOfProduct = new Product();
			listOfProduct.setId(rs.getInt(1));
			listOfProduct.setpCode(rs.getString(2));
			listOfProduct.setpDiscription(rs.getString(3));
			listOfProduct.setpPrice(rs.getDouble(4));
			listOfProduct.setCategoryName(rs.getString(5));
			listOfProduct.setpPath(rs.getString(6));

			productList.add(listOfProduct);

		}

		return productList;

	}

}
