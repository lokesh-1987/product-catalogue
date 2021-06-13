package com.sapient.ecommerce.service;

import com.sapient.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
	List<Product> findAll();
	List<Product> getProducts(String groupbyvalue, String actualvalue);
}
