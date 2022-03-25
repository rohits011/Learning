package com.rohit.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohit/springjdbc/config.xml");

		JdbcTemplate bean = (JdbcTemplate) context.getBean("jdbcTemplate");
//		System.out.println(bean);
		String sql = "insert into employee values(?,?,?)";
		int result = bean.update(sql, 1, "Rohit", "Singh");
		System.out.println("number of record inserted : " + result);
	}

}
