package com.rohit.SpringCore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.SpringCore.innerbeans.Employee;

/**
 * @author apple
 *
 */
public class Test {

//	private static final String CommonAnnotationBeanPostProcessor = null;

	public static void main(String a[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/SpringCore/innerbeans/config.xml");
		
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean.hashCode());
//		context.registerShutdownHook();
		Employee bean1 = (Employee) context.getBean("employee");
		System.out.println(bean1.hashCode());
		
		//as singleton scope both object return same hashcode bcz they using same obj ref.
//		
	}
	
}
