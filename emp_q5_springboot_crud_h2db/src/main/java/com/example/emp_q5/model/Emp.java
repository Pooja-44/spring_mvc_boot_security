package com.example.emp_q5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
public class Emp 
{
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String department;
	private String designation;
	private String  salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
