package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


import com.DAO.employeeDAO;
import com.DB.DBConnect;

import com.entites.employee;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		String EmployeeName=request.getParameter("EmployeeName");
		String email=request.getParameter("email");
		String PhoneNumber=request.getParameter("PhoneNumber");
		String Password=request.getParameter("Password");
	    
		employee emp=new employee();
    	emp.setEmployeeName(EmployeeName);
    	emp.setEmail(email);
    	emp.setPhoneNumber (PhoneNumber );
    	emp.setPassword(Password);
    	
    	employeeDAO  dao=new employeeDAO(DBConnect.DgetConnection());
    	boolean f=dao.employeeRegister(emp);
    
    	
    	if(true) {
    		HttpSession session=request.getSession();
    		session.setAttribute("reg-msg","Registration Sucessfully...");
    		response.sendRedirect("Employee.jsp");
    		
    	}	
	
	}

}
