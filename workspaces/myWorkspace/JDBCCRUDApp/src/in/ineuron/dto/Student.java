package in.ineuron.dto;

import java.io.Serializable;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sid;
	private String name;
	private String email;
	private String city;
	private String country;
	
	static {
		System.out.println("Student.class is loading");
	}
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", city=" + city + ", country=" + country
				+ "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

}
