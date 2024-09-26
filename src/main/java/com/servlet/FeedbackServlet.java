package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.FeedBackDAO;

import com.DB.DBConnect;
import com.entites.FeedBack;


@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String FullName=request.getParameter("Fullname");
		String Email=request.getParameter("email");
		String Age=request.getParameter("age");
		String experience=request.getParameter("experience");	
		String PhoneNumber=request.getParameter("PhoneNumber");
		String Message=request.getParameter("Message");
	    
		FeedBack Feed=new FeedBack();
		Feed.setFullName(FullName);
		Feed.setEmail(Email);
		Feed.setAge(Age);
		Feed.setExperience(experience);
		Feed.setPhoneNumber(PhoneNumber); 
		Feed.setMessage(Message);
    	
    	FeedBackDAO  dao=new FeedBackDAO(DBConnect.DgetConnection());
    	boolean f=dao.FeedBackRegister(Feed);
    
    	
    	if(true) {
    		HttpSession session=request.getSession();
    		session.setAttribute("reg-msg","Registration Sucessfully...");
    		response.sendRedirect("Feedback.jsp");
    		
    	}	
	
	}
}


