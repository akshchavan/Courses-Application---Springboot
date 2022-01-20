package com.springrest.springrest.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String email;
	private String gender;
	
	@OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_fk",referencedColumnName = "id")
	private List<Course>Courses;
	

}
