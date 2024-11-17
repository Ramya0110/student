package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.SubjectEntity;

public interface SubjectRepo extends JpaRepository<SubjectEntity, Long> {

}
