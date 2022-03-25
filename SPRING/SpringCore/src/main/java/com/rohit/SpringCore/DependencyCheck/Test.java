package com.rohit.SpringCore.DependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author apple
 *
 */
public class Test {

//	private static final String CommonAnnotationBeanPostProcessor = null;

	public static void main(String a[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/SpringCore/DependencyCheck/config.xml");
		
		Prescription bean = (Prescription) context.getBean("pr");
		System.out.println(bean);
//		context.registerShutdownHook();
		
//		CommonAnnotationBeanPostProcessor
	}
	
}
