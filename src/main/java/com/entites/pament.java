package com.entites;

public class pament {
private String cardNo;
private String CvvNo;
private String NameOFBank;
private String DatePament;
public pament() {
	super();
	// TODO Auto-generated constructor stub
}
public pament(String cardNo, String cvvNo, String nameOFBank, String datePament) {
	super();
	this.cardNo = cardNo;
	this.CvvNo = cvvNo;
	this.NameOFBank = nameOFBank;
	this.DatePament = datePament;
}
public String getCardNo() {
	return cardNo;
}
public void setCardNo(String cardNo) {
	this.cardNo = cardNo;
}
public String getCvvNo() {
	return CvvNo;
}
public void setCvvNo(String cvvNo) {
	this.CvvNo = cvvNo;
}
public String getNameOFBank() {
	return NameOFBank;
}
public void setNameOFBank(String nameOFBank) {
	this.NameOFBank = nameOFBank;
}
public String getDatePament() {
	return DatePament;
}
public void setDatePament(String datePament) {
	this.DatePament = datePament;
}
@Override
public String toString() {
	return "pament [cardNo=" + cardNo + ", CvvNo=" + CvvNo + ", NameOFBank=" + NameOFBank + ", DatePament=" + DatePament
			+ "]";
}

}
