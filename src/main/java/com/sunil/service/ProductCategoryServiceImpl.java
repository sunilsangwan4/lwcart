package com.sunil.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunil.domain.ProductCategory;

public class ProductCategoryServiceImpl {

	public List<ProductCategory> getListOfpCategory(Connection con ) throws SQLException {
		
		
		PreparedStatement ps = con.prepareStatement("select * from product_categories");

		ResultSet rs = ps.executeQuery();


		List<ProductCategory> productCategories=new ArrayList<ProductCategory>();
		while (rs.next()) {
			ProductCategory productCategory=new ProductCategory();
			productCategory.setId(rs.getInt(1));
			productCategory.setCategoryName(rs.getString(2));
			productCategories.add(productCategory);
			
		}
		
		return productCategories;
		
	}
	
	
	
}
