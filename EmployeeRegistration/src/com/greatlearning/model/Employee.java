package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String useremail;
	private String password; 
	
public Employee(String firstName, String lastName, String useremail, String password) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.useremail = useremail;
	this.password = password;
}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
