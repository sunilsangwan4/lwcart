package com.sunil.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.http.HttpServlet;



public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaseServlet() {
		super();
	}

	protected  Connection getConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lwseckcart", "root", "sunil1234");

		} catch (Exception e2) {
			System.out.println(e2);
	
		
		}
	return con;
	
	}
}
