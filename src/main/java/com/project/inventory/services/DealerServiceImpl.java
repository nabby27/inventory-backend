package com.project.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.inventory.repositories.DealersRepository;

@Service
public class DealerServiceImpl implements DealerService {

	@Autowired
	protected DealersRepository dealersRepository;
	
}
