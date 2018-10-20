package com.project.inventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.inventory.models.ChangeLog;

public interface ChangeLogRepository extends JpaRepository<ChangeLog, Long> {

}
