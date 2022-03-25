package com.rohit.SpringCore.LC.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter");
		this.id = id;
	}

	public void hi() {//name can be anything of init method
		System.out.println("hi");
	}
	public void bye() {//name can be anything of destroy method
		System.out.println("bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After property set");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy");
		
	}
}
