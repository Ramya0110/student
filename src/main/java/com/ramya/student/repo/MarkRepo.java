package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.MarkModel;

public interface MarkRepo extends JpaRepository<MarkModel, Long> {

}
