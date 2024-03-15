package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.entity.Employee;


@Repository
public class EmpDaoImpl implements EmpDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public EmpDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public EmpDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public int saveEmp(Employee emp) {
		
		int r=(Integer) hibernateTemplate.save(emp);
		return r;
	}

	public Employee getEmpById(int id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	public List<Employee> getAllEmp() {
		List<Employee> list = hibernateTemplate.loadAll(Employee.class);
		return list;
	}

	@Transactional
	public void update(Employee emp) {
		hibernateTemplate.update(emp);
		
	}

	@Transactional
	public void deleteEmp(int id) {
		Employee emp = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(emp);
	}
	
	
}
