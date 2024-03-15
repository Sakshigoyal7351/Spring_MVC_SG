package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmpDao {

	public int saveEmp(Employee emp);
	
	public Employee getEmpById(int id);
	
	public List<Employee> getAllEmp();
	
	public void update(Employee emp);
	
	public void deleteEmp(int id);
}
