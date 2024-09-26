package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.HotelBookingDAO;

import com.DB.DBConnect;
import com.entites.HotelBooking;


@WebServlet("/HotelServlet")
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Firstname=request.getParameter("Firstname");
		String Lastname=request.getParameter("Lastname");
		String PhoneNo=request.getParameter("PhoneNo");
		String Email=request.getParameter("email");
		String DepartureDate=request.getParameter("DepartureDate");
		String ArrivalDate=request.getParameter("ArrivalDate");
		String Noofguest=request.getParameter("Noofguest");
		String RoomType=request.getParameter("RoomType");
		
		HotelBooking ho=new HotelBooking();
    	ho.setFirstname(Firstname);
    	ho.setLastname(Lastname);
    	ho.setPhoneNo(PhoneNo);
    	ho.setEmail(Email);
    	ho.setDepartureDate(DepartureDate);
    	ho.setArrivalDate(ArrivalDate);
    	ho.setNoofguest(Noofguest);
    	ho.setRoomType(RoomType);
    	
    	
    	
    	
    	
    	HotelBookingDAO  dao=new HotelBookingDAO(DBConnect.DgetConnection());
    	boolean f=dao.HotelRegister(ho);
    	
    	if(true) {
    		HttpSession session=request.getSession();
    		session.setAttribute("reg-msg","Booking Sucessfully...");
    		response.sendRedirect("payment.jsp");
    		
    	}

    
   
    	
    	}
}


