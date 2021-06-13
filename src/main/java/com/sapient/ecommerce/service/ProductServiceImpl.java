package com.sapient.ecommerce.service;

import java.util.List;

import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.repository.ProductRepository;
import com.sapient.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

enum GroupBy {

	BRAND("brand"), COLOR("color"), SIZE("size");
	String value;

	GroupBy(String name) {
		value = name;
	}

	String getValue() {
		return value;
	}
}

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getProducts(String groupByValue, String actualvalue) {
		GroupBy groupBy = GroupBy.valueOf(groupByValue.toUpperCase());
		switch (groupBy) {
		case BRAND:
			return productRepository.findByBrandId(Integer.valueOf(actualvalue));
		case COLOR:
			return productRepository.findByColorId(Integer.valueOf(actualvalue));
		case SIZE:
			return productRepository.findBySize(actualvalue);
		default:
			return null;
		}
	}

}
