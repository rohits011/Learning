package com.rohit.SpringCore.LC.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String a[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/SpringCore/LC/interfaces/config.xml");
		
		Patient bean = (Patient) context.getBean("patient");
		System.out.println(bean);
		context.registerShutdownHook();
	}
}
