package com.rohit.springcoreadvanced.autowiring.annotations;

public class Address {

	private String Hno;
	private String city;
	private String state;
	public String getHno() {
		return Hno;
	}
	public void setHno(String hno) {
		Hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", city=" + city + ", state=" + state + "]";
	}
	
}
