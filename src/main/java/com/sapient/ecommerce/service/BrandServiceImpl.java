package com.sapient.ecommerce.service;

import java.util.List;

import com.sapient.ecommerce.entity.Brand;
import com.sapient.ecommerce.repository.BrandRepository;
import com.sapient.ecommerce.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

}
