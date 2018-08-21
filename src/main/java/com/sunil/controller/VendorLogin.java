package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vendorLogin")
public class VendorLogin extends BaseServlet {
	private static final long serialVersionUID = 1L;
    
    public VendorLogin() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String userName = request.getParameter("userEmail");
		String userPassword = request.getParameter("userPassword");
		
	Connection connection = getConnection();
	
	try {
		PreparedStatement ps = connection
				.prepareStatement("select * from registerVendor where userEmail =? and userPassword =?");

		ps.setString(1, userName);
		ps.setString(2, userPassword);

		ResultSet rs = ps.executeQuery();

		boolean isUserValid = false;

		while (rs.next()) {
			isUserValid = true;
			break;
		}

		if (isUserValid) {
			response.sendRedirect("welcome.jsp");
		}
		else {
			
			request.setAttribute("error"," invalid email and password ");
			request.getRequestDispatcher("vendorLogin.jsp").forward(request, response);
	
			
			
		}

		connection.close();
	} catch (Exception ex) {
	}
	}

}
