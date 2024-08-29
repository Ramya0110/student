package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.SubjectModel;

public interface SubjectRepo extends JpaRepository<SubjectModel, Long> {

}
