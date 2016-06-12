package kr.co.iamtek.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student1 {
	
	private String firstName;
	private String lastName;
	
	public Student1() {};
	
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
	/*
	public String getName() {
		return (this.firstName + this.lastName);
	}
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	*/
}
