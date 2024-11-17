package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.MarkEntity;

public interface MarkRepo extends JpaRepository<MarkEntity, Long> {

}
