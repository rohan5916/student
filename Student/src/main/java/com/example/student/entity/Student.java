package com.example.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	private String subject;
	private long marks;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	
	
}
