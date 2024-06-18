package com.attendencefacultymanage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String Name;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", Name=" + Name + "]";
	}
	
	
	

}
