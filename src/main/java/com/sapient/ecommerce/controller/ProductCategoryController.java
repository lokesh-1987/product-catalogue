package com.sapient.ecommerce.controller;

import java.util.List;

import com.sapient.ecommerce.entity.ProductCategory;
import com.sapient.ecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productcategories")
public class ProductCategoryController {
	@Autowired
	private ProductCategoryService productCategoryService;

	@GetMapping
	public ResponseEntity<List<ProductCategory>> findAll() {
		List<ProductCategory> list = productCategoryService.findAll();

		return new ResponseEntity<List<ProductCategory>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}