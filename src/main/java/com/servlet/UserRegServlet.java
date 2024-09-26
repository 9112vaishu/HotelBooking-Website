package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.UserDAO;
import com.DB.DBConnect;
import com.entites.User;

@WebServlet("/UserRegServlet")
public class UserRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name=request.getParameter("userName");
		String Email=request.getParameter("email");
		String PhoneNumber=request.getParameter("PhoneNumber");
		String UPassword=request.getParameter("UPassword");
	    
		User us=new User();
    	us.setName(Name);
    	us.setEmail(Email);
    	us.setPhonenumber(PhoneNumber);
    	us.setUPassword(UPassword);
    	
    	UserDAO  dao=new UserDAO(DBConnect.DgetConnection());
    	boolean f=dao.userRegister(us);
    	
    	if(true) {
    		HttpSession session=request.getSession();
    		session.setAttribute("reg-msg","Registration Sucessfully...");
    		response.sendRedirect("UserReg.jsp");
    		
    	}
    	}
	
	}


