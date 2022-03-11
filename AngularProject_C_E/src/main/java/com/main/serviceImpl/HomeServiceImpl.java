package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Employee;
import com.main.repository.HomeRepository;
import com.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired 
	HomeRepository hr;

	@Override
	public Employee insertEmp(Employee e) {
		Employee emp= hr.save(e);
		return emp;
	}

	@Override
	public List<Employee> displayAll() {
		List<Employee> al=(List<Employee>) hr.findAll();
		return al;
	}

	@Override
	public void deleteEmp(int eid) {
		
	hr.deleteById(eid);
		
	}

	@Override
	public Employee updateEmp(Employee e) {
		Employee emp=hr.save(e);
		return emp;
	}

	@Override
	public Employee getSingle(int id) {
		Employee employee = hr.findById(id).get();
		return employee;
	}
	
	

}
