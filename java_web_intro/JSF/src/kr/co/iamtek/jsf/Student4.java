package kr.co.iamtek.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student4 {
	
	private String firstName;
	private String lastName;
	private String language;
	
	public Student4() {
		
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
