package com.sunil.domain;

public class Product {



	int id;
	String pCode;
	String pDiscription;
	double pPrice;
	String pCategoryId;
	String pPath;
String categoryName;
	public int getId() {
		return id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpDiscription() {
		return pDiscription;
	}
	public void setpDiscription(String pDiscription) {
		this.pDiscription = pDiscription;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public String getpCategoryId() {
		return pCategoryId;
	}
	public void setpCategoryId(String pCategoryId) {
		this.pCategoryId = pCategoryId;
	}
	public String getpPath() {
		return pPath;
	}
	public void setpPath(String pPath) {
		this.pPath = pPath;
	}




}
