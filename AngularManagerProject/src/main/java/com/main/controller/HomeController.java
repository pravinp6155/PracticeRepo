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

import com.main.model.Product;
import com.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class HomeController {

	
	@Autowired
	HomeService hs;
	
	@PostMapping("/insert")
	public Product insert(@RequestBody Product p) {
		
		Product prod=hs.saveprod(p);
		return prod;
	}
	
	@GetMapping("/getAll")
	public List<Product> get()
	{
		List<Product> al = hs.getAllData();
		return al;
	}
	
	@GetMapping("/getById/{id}")
	public Product getdata(@PathVariable("id") int pid)
	{
		Product prod=hs.getById(pid);
		return prod;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int pid)
	{
		hs.deleteProd(pid);
		return "Deleted ";
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product p) {
		Product pro=hs.updateData(p);
		return pro;
	}
}
