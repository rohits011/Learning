package com.rohit.springcoreadvanced.autowiring;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Employee {
// private int id;
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
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [ add=" + add + "]";
}
 
	
}
