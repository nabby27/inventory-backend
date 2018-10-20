package com.project.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.inventory.repositories.ChangeLogRepository;

@Service
public class ChangeLogServiceImpl implements ChangeLogService {

	@Autowired
	protected ChangeLogRepository changeLogRepository;
	
}
