package com.sunil.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VendorRegistration
 */
@WebServlet("/Vendor_Registration")
public class VendorRegistration extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    
    public VendorRegistration() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userPassword = request.getParameter("userPassword");
		String userConfirmPassword = request.getParameter("userConfirmPassword");
		
		
		if(!userPassword.equals(userConfirmPassword)) {
			
			
			
			request.setAttribute("error"," password and confirm password does not match ");
			request.getRequestDispatcher("vendorRegistration.jsp").forward(request, response);
	
		}
		
		
		Connection connection = getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("insert into registerVendor values(?,?,?)");

			ps.setString(1, username);
			ps.setString(2, userEmail);
			ps.setString(3, userPassword);
			

			ps.executeUpdate();

			connection.close();
	}
		catch (Exception ex) {
		}
			response.sendRedirect("vendorLogin.jsp");
	}
}
