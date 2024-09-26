package com.entites;

public class User {
private String Name;
private String Email;
private String Phonenumber;
private String UPassword;
 public User() 
 {
	 super();
 }
 public User(String name, String email, String Phonenumber, String UPassword) {
	super();
	this.Name = name;
	this.Email = email;
	this.Phonenumber = Phonenumber;
	this.UPassword = UPassword;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	this.Email = email;
}
public String getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(String Phonenumber) {
    this.Phonenumber = Phonenumber;
}
public String getUPassword() {
	return UPassword;
}
public void setUPassword(String uPassword) {
	UPassword = uPassword;
}



}

