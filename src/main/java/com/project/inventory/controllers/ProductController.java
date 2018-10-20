package com.project.inventory.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.inventory.models.Product;
import com.project.inventory.services.ProductService;
import com.project.inventory.utils.RestResponse;

@RestController
public class ProductController {

	@Autowired
	protected ProductService productService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String productJSON) throws JsonParseException, JsonMappingException, IOException {
		
		Product product = this.mapper.readValue(productJSON, Product.class);
		return null;
	}
	
	/*private boolean validate(Product product) {
		boolean isValid = true;
		
		if (product.getBrand() == null || product.getBrand().equals("")) {
			isValid = false;
		} else if (product.getChangeLog() == null || product.getChangeLog().equals("")) {
			isValid = false;
		} else if (product.getCod() == null || product.getCod().equals("")) {
			isValid = false;
		} else if (product.getName() == null || product.getName().equals("")) {
			isValid = false;
		} else if (product.getProvider() == null || product.getProvider().equals("")) {
			isValid = false;
		}
	}*/
	
}
