package com.rohit.springcoreadvanced.autowiring;

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
		ApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/springcoreadvanced/autowiring/config.xml");
		
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);
//		context.registerShutdownHook();
	
		//as singleton scope both object return same hashcode bcz they using same obj ref.
//		
	}
	
}
