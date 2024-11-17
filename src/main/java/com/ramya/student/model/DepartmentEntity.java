package com.ramya.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ramya.student.enums.Department;

@Entity
@Table(name = "departments")
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_dept_id")
	@SequenceGenerator(name = "seq_dept_id", initialValue = 1, allocationSize = 1)
	@Column(name = "dept_id")
	public Long deptId;

	@Column(name = "dept_code")
	@Enumerated(EnumType.ORDINAL)
	public Department deptCode;

}
