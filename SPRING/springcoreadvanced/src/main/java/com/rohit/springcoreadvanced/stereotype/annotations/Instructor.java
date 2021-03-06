package com.rohit.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")// we can remove value and can use camelcase name 
@Scope("prototype")//to create new obj every time
public class Instructor {

	@Value("10")
	private int id;//annotation alwas will override assigned values
	@Value("rohit singh")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;
	@Autowired
	private Profile profile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}
	
	
	
}
