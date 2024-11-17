package com.ramya.student.model;

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
import javax.persistence.UniqueConstraint;

import lombok.Getter;

@Entity
@Getter
@Table(name = "marks", uniqueConstraints = { @UniqueConstraint(name = "uk_marks", columnNames = { "mrk_std_id", "mrk_sub_id" }) })
public class MarkEntity {
	
	public class A{
		int a ;
		
		void testA(){
			
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mrk_id")
	@SequenceGenerator(name = "seq_mrk_id", initialValue = 1, allocationSize = 1)
	@Column(name = "mrk_id")
	public Long mrkId;

	@ManyToOne
	@JoinColumn(name = "mrk_std_id")
//	@JoinTable(
//			name = "student_marks",
//			joinColumns = @JoinColumn(name = "sm_std_id"),
//			inverseJoinColumns = @JoinColumn(name = "sm_mrk_id")
//			)
	public StudentEntity mrkStdId;
	
	@OneToOne
	@JoinColumn(name = "mrk_sub_id")
	public SubjectEntity mrkSubId;

	@Column(name = "mrk_mark")
	public Long mrkMark;
	
	public static void test(){
		
	}

}
