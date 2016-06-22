package kr.co.iamtek.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student3 {
	
	private String firstName;
	private String lastName;
	private String country;
	
	//list of countries for the drop-down list
	public List<String> countryOptions;
	
	public Student3() {
		countryOptions = new ArrayList<>();

		countryOptions.add("Asia");
		countryOptions.add("N.America");
		countryOptions.add("S.America");
		countryOptions.add("Europe");
		countryOptions.add("Africa");
	}

	public List<String> getCountryOptions() {
		return countryOptions;
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
