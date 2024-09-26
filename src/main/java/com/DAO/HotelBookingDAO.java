package com.DAO;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import com.entites.HotelBooking;

	
public class HotelBookingDAO {
	 private Connection conn;

		public HotelBookingDAO(Connection conn) {
			super();
			this.conn = conn;
		}

		  public boolean HotelRegister(HotelBooking hot) {
			 boolean f=false;
			 String result="data is enter sucessfully";
			 try {   
				  String qu="insert into hotelMangament.HotelBooking values(?,?,?,?,?,?,?,?)";
			      PreparedStatement ps=conn.prepareStatement(qu);
				  ps.setString(1,hot.getFirstname());
			      ps.setString(2,hot.getLastname());
			      ps.setString(3,hot.getPhoneNo());
			      ps.setString(4,hot.getEmail());
			      ps.setString(5,hot.getDepartureDate());
			      ps.setString(6,hot.getArrivalDate());
			      ps.setString(7,hot.getNoofguest());
			      ps.setString(8,hot.getRoomType());
			      ps.executeUpdate();
			      f=true;
			      
			  } catch (SQLException e) {
				e.printStackTrace();
				result="data not inserted";
			}
		     
		      return f;
		  }
		  
	}


