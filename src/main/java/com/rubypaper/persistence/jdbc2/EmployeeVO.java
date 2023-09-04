package com.rubypaper.persistence.jdbc2;
import java.sql.Timestamp;

public class EmployeeVO {
		private Long id;
		private String name;
		private Timestamp stratDate;
		private String title;
		private String deptName;
		private Long salary;
		
		public Long getId() {
			return id;
		}
		
		public void setId(Long id){
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public Timestamp getStratDate() {
			return stratDate;
		}
		
		public void setStratDate(Timestamp stratDate){
			this.stratDate = stratDate;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title){
			this.title = title;
		}
		
		public String getDeptName() {
			return deptName;
		}
		
		public void setDeptName(String deptName){
			this.deptName = deptName;
		}
		
		public Long getSalary() {
			return salary;
		}
		
		public void setSalary(Long salary){
			this.salary = salary;
		}
		
		@Override
		public String toString()
		{
			return "EmployeeVo[ "+ id + "//" + name + "//" + stratDate + "//" + title + "//" + deptName + "//" + salary + "]";
		}
		
		
		
		
}