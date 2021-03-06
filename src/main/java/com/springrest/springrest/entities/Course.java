package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Course {
	
	@Id
	private long id;
    private String title;
	private String description;
	
		
	
	
//	public Course(long id, String title, String description) {
//		this.id = id;
//		this.title = title;
//		this.description = description;
//	}
//
//	public Course() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	@Override
//	public String toString() {
//		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
//	}	
//	
	

}
