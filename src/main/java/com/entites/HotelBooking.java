package com.entites;

public class HotelBooking {
private String Firstname;
private String Lastname;
private String PhoneNo;
private String Email;
private String DepartureDate;
private String ArrivalDate;
private String Noofguest;
private String RoomType;
public HotelBooking() {
	super();
	// TODO Auto-generated constructor stub
}
public HotelBooking(String Firstname, String Lastname, String PhoneNo, String Email, String DepartureDate,
		String ArrivalDate, String Noofguest, String RoomType) {
	super();
	this.Firstname = Firstname;
	this.Lastname = Lastname;
	this.PhoneNo = PhoneNo;
	this.Email = Email;
	this.DepartureDate = DepartureDate;
	this.ArrivalDate = ArrivalDate;
	this.Noofguest = Noofguest;
	this.RoomType = RoomType;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String Firstname) {
	this.Firstname = Firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String Lastname) {
	this.Lastname = Lastname;
}
public String getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(String PhoneNo) {
	this.PhoneNo = PhoneNo;
}
public String getEmail() {
	return Email;
}
public void setEmail(String Email) {
	this.Email = Email;
}
public String getDepartureDate() {
	return DepartureDate;
}
public void setDepartureDate(String DepartureDate) {
	this.DepartureDate = DepartureDate;
}
public String getArrivalDate() {
	return ArrivalDate;
}
public void setArrivalDate(String ArrivalDate) {
	this.ArrivalDate = ArrivalDate;
}
public String getNoofguest() {
	return Noofguest;
}
public void setNoofguest(String Noofguest) {
	this.Noofguest = Noofguest;
}
public String getRoomType() {
	return RoomType;
}
public void setRoomType(String RoomType) {
	this.RoomType = RoomType;
}

public String toString() {
	return "HotelBooking [Firstname=" + Firstname + ", Lastname=" + Lastname + ", PhoneNo=" + PhoneNo + ", Email="
			+ Email + ", DepartureDate=" + DepartureDate + ", ArrivalDate=" + ArrivalDate + ", Noofguest=" + Noofguest
			+ ", RoomType=" + RoomType + "]";
}



}

