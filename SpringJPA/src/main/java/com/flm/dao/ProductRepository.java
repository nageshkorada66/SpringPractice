package com.flm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> { 

	
	@Query("From Product where id = :id")
	public Product getProductById(int id);
	
	@Query(nativeQuery = true, value = "select * from products where name = :name")
	public Product getProductByName(String name);
}
