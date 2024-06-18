package com.attendencefacultymanage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassRoom {
	@Id
	private int id;
	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	public ClassRoom(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", name=" + name + "]";
	}
	
	

}
