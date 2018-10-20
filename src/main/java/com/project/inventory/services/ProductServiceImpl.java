package com.project.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.inventory.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	protected ProductRepository productRepository;

}
