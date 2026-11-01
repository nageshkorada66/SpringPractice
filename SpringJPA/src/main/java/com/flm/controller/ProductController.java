package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.Product;
import com.flm.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/save")
	public String saveProduct() {
		productService.saveProduct();
		return "Product Saved";
	}
	
	@GetMapping("/byid")
	public Product findProductById() {
		return productService.findProductById();
	}

	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/delete")
	public String deleteProduct() {
		productService.deleteProduct();
		return "Product deleted";
	}
	
	@GetMapping("/update")
	public Product updateProduct() {
		return productService.updateProduct();
	}
	
	@GetMapping("/byname")
	public Product getProductByName() {
		return productService.getProductByName();
	}
}
