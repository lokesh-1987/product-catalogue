package com.sapient.ecommerce.service;

import java.util.List;

import com.sapient.ecommerce.entity.Color;
import com.sapient.ecommerce.repository.ColorRepository;
import com.sapient.ecommerce.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl implements ColorService {
	
	@Autowired
	private ColorRepository colorRepository;

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}
	
}
