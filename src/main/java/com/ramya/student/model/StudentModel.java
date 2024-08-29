package com.ramya.student.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_std_id")
	@SequenceGenerator(name = "seq_std_id", initialValue = 1, allocationSize = 1)
	@Column(name = "std_id")
	public Long stdId;

	@OneToOne
	@JoinColumn(name = "std_dep_id")
	public DepartmentModel stdDepId;

	@Column(name = "std_section")
	public String stdSection;

	@Column(name = "std_name")
	public String stdName;

	@Column(name = "std_dob")
	public Date stdDob;

	@Column(name = "std_gender")
	public String stdGender;

}
