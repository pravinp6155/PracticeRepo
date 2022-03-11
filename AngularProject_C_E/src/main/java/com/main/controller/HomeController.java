package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Employee;
import com.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/insert")
	public Employee saveEmp(@RequestBody()  Employee e) {
		
		Employee emp=hs.insertEmp(e);
		
		return emp;
		
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllData(){
		List<Employee> al=	hs.displayAll();
		
		return al;
	}
	
	@GetMapping("/getById/{eid}")
	public Employee getSingle(@PathVariable("eid") int id) {
		Employee emp=hs.getSingle(id);
		return emp;
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") int eid)
	{
		hs.deleteEmp(eid);
	}
	
	@PutMapping("update")
	public Employee update(@RequestBody Employee e) {
	
		Employee emp=hs.updateEmp(e);
		return emp;
	}
}
