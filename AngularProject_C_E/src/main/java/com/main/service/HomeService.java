package com.main.service;


import java.util.List;

import com.main.model.Employee;


public interface HomeService {

	
	public Employee insertEmp(Employee e);

	public List<Employee> displayAll();

	public void deleteEmp(int eid);

	public Employee updateEmp(Employee e);

	public Employee getSingle(int id);

}
