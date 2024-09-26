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


@WebServlet("/UserLogServlet")
public class UserLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
	    String UPassword=request.getParameter("UPassword");
	    
	    UserDAO dao=new UserDAO(DBConnect.DgetConnection());
	    User user=dao.Getlogin(email, UPassword);
	    
	    if(user != null)
	    {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("user-ob",user);
	    	response.sendRedirect("HotelBook.jsp");
	    	 
	    	
    		
	    }
	    else {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("error-msg", "somting went wrong..");
	    	response.sendRedirect("UserLog.jsp");
	    	System.out.println("somthing went wrong");

	    }
	   
	}
	
}


