package com.flm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.ProductRepository;
import com.flm.model.Product;

@Component
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public void saveProduct() {
		Product product = new Product("Ac", 29999);
		
		productRepository.save(product);
	}
}
