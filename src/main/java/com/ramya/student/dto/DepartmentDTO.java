package com.ramya.student.dto;

import com.ramya.student.enums.Department;

public class DepartmentDTO {
	
	private Long deptId;
	private Department deptCode;
	
	public DepartmentDTO() {
		
	}
	
	public DepartmentDTO(Long deptId,Department deptCode) {
		this.deptId=deptId;
		this.deptCode=deptCode;
	}
	
	public DepartmentDTO(Builder builder){
		this.deptId = builder.deptId;
		this.deptCode = builder.deptCode;
	}
	
	public Long getDeptId() {
		return this.deptId;
	}
	
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	
	public Department getDeptCode() {
		return this.deptCode;
	}
	
	public void setDeptCode(Department deptCode) {
		this.deptCode = deptCode;
	}
	
	
	public static class Builder {
		
		private Long deptId;
		private Department deptCode;
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		public Builder deptCode(Department deptCode) {
			this.deptCode = deptCode;
			return this;
			
		}
		
		public Builder deptId(Long deptId) {
			this.deptId = deptId;
			return this;
			
		}
		
		public DepartmentDTO build() {
			return new DepartmentDTO(this);
		}
	}

}
