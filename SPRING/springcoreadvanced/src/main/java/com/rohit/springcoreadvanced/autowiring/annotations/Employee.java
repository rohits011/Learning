package com.rohit.springcoreadvanced.autowiring.annotations;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
// private int id;

	@Autowired  ///it also can be done on constructor and setter method
	private Address add;

//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
	public Address getAdd() {
		return add;
	}

//
//@Autowired
//public void setAdd(Address add) {
//	this.add = add;
//}

	@Override
	public String toString() {
		return "Employee [ add=" + add + "]";
	}

}
