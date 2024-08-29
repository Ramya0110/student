package com.ramya.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dep_id")
	@SequenceGenerator(name = "seq_dep_id", initialValue = 1, allocationSize = 1)
	@Column(name = "dep_id")
	public Long deptId;

	@Column(name = "dep_name")
	public String deptName;

}
