package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entites.User;

public class UserDAO {
	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	  public boolean userRegister(User us) {
		 boolean f=false;
		  try {
			  
			  String qu="insert into hotelMangament.UserInfo values(?,?,?,?)";
			  PreparedStatement ps=conn.prepareStatement(qu);
		      ps.setString(1, us.getName());
		      ps.setString(2, us.getEmail());
		      ps.setString(3, us.getPhonenumber());
		      ps.setString(4,us.getUPassword());
		      ps.executeUpdate();
		      f=true;
		      
		  } catch (SQLException e) {
			e.printStackTrace();
		}
	     
	      return f;
	  }
	  // for login
	  public User Getlogin(String em,String ps) {
		User us=null;
		  try {
			  
			String qu="select *from UserInfo where email=? and UPassword=? ";
			
			PreparedStatement pst=conn.prepareStatement(qu);
			pst.setString(1, em);
			pst.setString(2, ps);
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				us=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4) );
			    
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		  return us;
		  
	  }
}
