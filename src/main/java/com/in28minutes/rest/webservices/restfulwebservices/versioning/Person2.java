package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Person2 {
	private String fname;
	private String lname;
	public Person2() {
		super();
	}
	public Person2(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
