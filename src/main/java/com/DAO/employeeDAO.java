package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entites.employee;


public class employeeDAO {
	private Connection conn;

	public employeeDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	  public boolean employeeRegister(employee empd) {
		 boolean f=false;
		 String result="data is enter sucessfully";
		 
			   
			  String qu="insert into hotelMangament.employee values(?,?,?,?)";
			 try {
			  PreparedStatement ps=conn.prepareStatement(qu);
			  
		      ps.setString(1, empd.getEmployeeName());
		      ps.setString(2, empd.getEmail());
		      ps.setString(3, empd.getPhoneNumber());
		      ps.setString(4,empd.getPassword());
		      ps.executeUpdate();
		      f=true;
		      
		  } catch (SQLException e) {
			e.printStackTrace();
			result="data not inserted";
			
		}
	     
	      return f;
	  }
	  // for login
	  public employee getlogin(String em,String ps) {
		employee emp=null;
		  try {
			  
			String qu="select *from employee where email=? and password=?";
			
			PreparedStatement pst=conn.prepareStatement(qu);
			pst.setString(1, em);
			pst.setString(2, ps);
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				emp=new employee(rs.getString(1),rs.getNString(2),rs.getString(3),rs.getString(4) );
			    
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		  return emp;
		  
	  }
}
