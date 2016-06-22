package kr.co.iamtek.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student2 {
	
	private String firstName;
	private String lastName;
	private String country;
	
	public Student2() {
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	};

}
