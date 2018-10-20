package com.project.inventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.inventory.services.DealerService;

@RestController
public class DealerController {

	@Autowired
	protected DealerService dealerService;
	
	protected ObjectMapper mapper;
	
}
