package com.rohit.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.rohit.SpringCore.innerbeans.Employee;

/**
 * @author apple
 *
 */
public class Test {

//	private static final String CommonAnnotationBeanPostProcessor = null;

	public static void main(String a[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/springcoreadvanced/injecting/interfaces/config.xml");
		
		OrderBO bean = (OrderBO) context.getBean("bo");
		bean.placeOrder();
		
		System.out.println(bean);
//		context.registerShutdownHook();
	
		//as singleton scope both object return same hashcode bcz they using same obj ref.
//		
	}
	
}
