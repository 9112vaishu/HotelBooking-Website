package com.DAO;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import com.entites.pament;

	

public class pamentDAO {
private Connection conn;

		public pamentDAO(Connection conn) {
			super();
			this.conn = conn;
		}

		  public boolean pamentRegister(pament  pn) {
			 boolean f=false;
			  try {
				  
				  String qu="insert into hotelMangament.Pament values(?,?,?,?)";
				  PreparedStatement ps=conn.prepareStatement(qu);
			      ps.setString(1, pn.getCardNo());
			      ps.setString(2, pn.getCvvNo());
			      ps.setString(3, pn.getNameOFBank());
			      ps.setString(4, pn.getDatePament());
			      ps.executeUpdate();
			      f=true;
			      
			  } catch (SQLException e) {
				e.printStackTrace();
			}
		     
		      return f;
		  }
		 
	}



