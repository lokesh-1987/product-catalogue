package com.sapient.ecommerce.service;

import java.util.List;

import com.sapient.ecommerce.entity.ProductCategory;
import com.sapient.ecommerce.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

}
