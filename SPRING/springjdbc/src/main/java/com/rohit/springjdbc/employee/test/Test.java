package com.rohit.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rohit.springjdbc.employee.Dao.EmployeeDAO;
import com.rohit.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohit/springjdbc/employee/test/config.xml");

		EmployeeDAO bean = (EmployeeDAO) context.getBean("employeeDao");
//		Employee e=new Employee();
//		e.setId(2);
//		e.setFirstname("Sukhvinder");
//		e.setLastname("Budhrayan");
//		
////		System.out.println(bean);
////		String sql = "insert into employee values(?,?,?)";
//		int result = bean.create(e);
//		result+=bean.delete(3);
		List<Employee> l=bean.read();
		System.out.println("record  : " + l);
	}

}
