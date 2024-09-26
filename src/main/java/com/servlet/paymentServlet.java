package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


import com.DAO.pamentDAO;
import com.DB.DBConnect;
import com.entites.pament;

@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cardNo=request.getParameter("cardNo");
		String CvvNo=request.getParameter("payment");
		String NameOFBank=request.getParameter("NameOfBank");
		String setDatePament=request.getParameter("DateOfPayment");
	    
		pament us=new pament();
    	us.setCardNo(cardNo);
    	us.setCvvNo(CvvNo);
    	us.setNameOFBank(NameOFBank);
    	us.setDatePament(setDatePament);
    	
    	pamentDAO  dao=new pamentDAO(DBConnect.DgetConnection());
    	boolean f=dao.pamentRegister(us);
    	
    	if(true) {
    		HttpSession session=request.getSession();
    		session.setAttribute("reg-msg","Payment Sucessfully...");
    		response.sendRedirect("payment.jsp");
    		
    	}
    	}
		
	}


