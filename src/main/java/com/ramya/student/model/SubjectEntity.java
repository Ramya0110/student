package com.ramya.student.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;

@Entity
@Getter
@Table(name = "subjects")
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sub_id")
	@SequenceGenerator(name = "seq_sub_id", initialValue = 1, allocationSize = 1)
	@Column(name = "sub_id")
	public Long subId;

    @ManyToMany
	@JoinTable(name = "subject_dept", joinColumns = @JoinColumn(name = "sd_sub_id"), inverseJoinColumns = @JoinColumn(name = "sd_dept_id"),uniqueConstraints = {@UniqueConstraint(columnNames = {"sd_sub_id","sd_dept_id"})})
	public List<DepartmentEntity> subDeptId;

	@Column(name = "sub_name")
	public String subName;

	@Column(name = "sub_year")
	public Long subYear;

	@Column(name = "sub_sem")
	public Long subSem;

}
