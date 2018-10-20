package com.project.inventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.inventory.models.Dealer;

public interface DealersRepository extends JpaRepository<Dealer, Long> {
	
}
