package com.main.service;

import java.util.List;

import com.main.model.Product;

public interface HomeService {

	public	Product saveprod(Product p);

	public List<Product> getAllData();

	public Product getById(int pid);

	public void deleteProd(int pid);

	public Product updateData(Product p);

}
 