package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.UserDAO;
import com.DAO.employeeDAO;
import com.DB.DBConnect;
import com.entites.User;
import com.entites.employee;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
	    String Password=request.getParameter("Password");
	    
	    employeeDAO dao=new employeeDAO(DBConnect.DgetConnection());
	    employee user=dao.getlogin(email, Password);
	    
	    if(user != null)
	    {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("user-ob",user);
	    	response.sendRedirect("webhome.html");
	    	 
	    	HttpSession session2=request.getSession();
    		session2.setAttribute("logout-msg","logout Sucessfully...");
    		
	    }
	    else {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("error-msg", "somting went wrong..");
	    	response.sendRedirect("employeeLogin.jsp");
	    	System.out.println("somthing went wrong");

	    }
	   
	}
	

}
