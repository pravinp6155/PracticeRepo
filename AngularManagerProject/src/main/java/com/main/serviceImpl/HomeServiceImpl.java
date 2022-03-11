package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Product;
import com.main.repository.HomeRepository;
import com.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired 
	HomeRepository hr;

	@Override
	public Product saveprod(Product p) {
		Product prod=hr.save(p);
		return prod;
	}

	@Override
	public List<Product> getAllData() {
		List<Product> al=(List<Product>) hr.findAll();
		return al;
	}

	@Override
	public Product getById(int pid) {
		Product prod=hr.findById(pid).get();
		return prod;
	}

	@Override
	public void deleteProd(int pid) {
	hr.deleteById(pid);
		
	}

	@Override
	public Product updateData(Product p) {
		Product pro=hr.save(p);
		return pro;
	}

}
