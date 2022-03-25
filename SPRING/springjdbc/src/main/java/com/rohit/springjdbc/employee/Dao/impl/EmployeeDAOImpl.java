 package com.rohit.springjdbc.employee.Dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rohit.springjdbc.employee.Dao.EmployeeDAO;
import com.rohit.springjdbc.employee.Dao.rowmapper.EmployeeRowMapper;
import com.rohit.springjdbc.employee.dto.Employee;

public class EmployeeDAOImpl  implements EmployeeDAO{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		
		// TODO Auto-generated method stub
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(),employee.getId());
		
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee e=jdbcTemplate.queryForObject(sql,rowMapper,id);
		// TODO Auto-generated method stub
		return e;
	}

	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> query = jdbcTemplate.query(sql, rowMapper);
		// TODO Auto-generated method stub
		return query;
	}

}
