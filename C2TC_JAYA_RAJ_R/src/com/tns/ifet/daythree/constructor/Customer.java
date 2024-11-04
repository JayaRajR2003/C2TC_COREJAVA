//Constructor Demo

package com.tns.ifet.daythree.constructor;

public class Customer {
	
	//Private variable
	private String cusName;
	private int cusID;
	private String cusCity;
	
	
	//Default Constructor
	public Customer() {
		System.out.println("Default Constructor");
	}


	//Paramerterized Constructor using this keyword
	public Customer(String cusName, int cusID, String cusCity) {
		super();
		this.cusName = cusName;
		this.cusID = cusID;
		this.cusCity = cusCity;
	}


	//getter and setter
	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusCity() {
		return cusCity;
	}

	public void setCusCity(String cusCity) {
		this.cusCity = cusCity;
	}


	@Override
	public String toString() {
		return "Customer [cusName=" + cusName + ", cusID=" + cusID + ", cusCity=" + cusCity + "]";
	}
	
	
}
