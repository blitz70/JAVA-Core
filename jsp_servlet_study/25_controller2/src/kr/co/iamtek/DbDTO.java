package kr.co.iamtek;

import java.sql.Timestamp;

public class DbDTO {
	
	//member data
	private String name;
	private String id;
	private String pw;
	private String email;
	private Timestamp date;
	private String address;
	
	public DbDTO() {
	}
	
	public DbDTO(String name, String id, String pw, String email, Timestamp date, String address) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.date = date;
		this.address = address;
	}
	
	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
