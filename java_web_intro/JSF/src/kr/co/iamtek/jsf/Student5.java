package kr.co.iamtek.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student5 {
	
	private String firstName;
	private String lastName;
	private String[] languages;
	
	public Student5() {
		
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

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
}
