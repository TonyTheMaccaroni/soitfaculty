package com.soit.soitfaculty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class Faculty {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;

	@Column(name="Title")
	private String title;
	
	@Column(name="email")
	private String email;
	
	//Set the Constructors
	
	public Faculty() {
		
	}

	public Faculty(int id, String firstName, String lastName, String title, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.email = email;
	}
	
	//Set the Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//toString method

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Title=" + title + ", email=" + email + "]";
	}
	
	
}
