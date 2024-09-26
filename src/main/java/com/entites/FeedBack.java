package com.entites;

public class FeedBack {
	
	private String FullName;
	private String Email;
	private String Age;
	private String PhoneNumber;
	private String Message;
    private String Experience;
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedBack(String FullName, String Email, String Age, String PhoneNumber, String Message, String Experience) {
		super();
		this.FullName = FullName;
		this.Email = Email;
		this.Age = Age;
		this.PhoneNumber = PhoneNumber;
		this.Message = Message;
		this.Experience = Experience;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String FullName) {
		this.FullName = FullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String Age) {
		this.Age = Age;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String Message) {
		this.Message = Message;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String Experience) {
		this.Experience = Experience;
	}
		
    
}

