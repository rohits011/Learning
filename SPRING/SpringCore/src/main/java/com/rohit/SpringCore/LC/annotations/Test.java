package com.rohit.SpringCore.LC.annotations;

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
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/SpringCore/LC/annotations/config.xml");
		
		Patient bean = (Patient) context.getBean("patient");
		System.out.println(bean);
		context.registerShutdownHook();
		
//		CommonAnnotationBeanPostProcessor
	}
	
}
