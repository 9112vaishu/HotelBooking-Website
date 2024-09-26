package com.entites;

public class employee {
private String EmployeeName;
private String email;
private String PhoneNumber;
private String Password;
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(String EmployeeName, String email, String PhoneNumber, String Password) {
	super();
	this.EmployeeName = EmployeeName;
	this.email = email;
	this.PhoneNumber = PhoneNumber;
	this.Password = Password;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String EmployeeName) {
	this.EmployeeName = EmployeeName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String PhoneNumber) {
	this.PhoneNumber = PhoneNumber;
}
public String getPassword() {
	return Password;
}
public void setPassword(String Password) {
	this.Password = Password;
}





}

