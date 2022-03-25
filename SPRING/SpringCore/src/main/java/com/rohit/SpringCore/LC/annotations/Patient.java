package com.rohit.SpringCore.LC.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside setter");
		this.id = id;
	}

	@PostConstruct
	public void hi() {//name can be anything of init method
		System.out.println("hi");
	}
	@PreDestroy
	public void bye() {//name can be anything of destroy method
		System.out.println("bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
}
