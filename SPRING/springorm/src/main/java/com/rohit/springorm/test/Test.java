package com.rohit.springorm.test;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.springorm.DAO.ProductDAO;
import com.rohit.springorm.entity.Product;

public class Test {
     public static void main(String a[]) {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("com/rohit/springorm/test/config.xml");
    	 ProductDAO bean = (ProductDAO) context.getBean("dao");
//    	 Product p=new Product();
//    	 p.setDesc("desc");
//    	 p.setId(3);
//    	 p.setName("samsung");
//    	 p.setPrice(100);
//    	 int re=bean.create(p);
//    	 bean.update(p);
//    	 bean.delete(p);
//    	 Product p=bean.find(2);
    	 List<Product> l=bean.findAll();
    	 System.out.println(l); 
     }
}
