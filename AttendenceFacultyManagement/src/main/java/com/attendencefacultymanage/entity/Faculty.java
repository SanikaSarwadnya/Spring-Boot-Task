package com.attendencefacultymanage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private int id;
	private int department_id;
	private String email;
	private String Name;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int id, int department_id, String email, String name) {
		super();
		this.id = id;
		this.department_id = department_id;
		this.email = email;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", department_id=" + department_id + ", email=" + email + ", Name=" + Name + "]";
	}
	
	

}
