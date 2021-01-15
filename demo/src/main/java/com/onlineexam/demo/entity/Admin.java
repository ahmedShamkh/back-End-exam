package com.onlineexam.demo.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Passward")
	private String passward;
	
	 
	@OneToMany(mappedBy = "admin")
	@JsonIgnore
	private List<Interviewee> interviewees;

	public Admin() {
		
	}
	
	public Admin(String name, String email, String passward) {
		super();
		this.name = name;
		this.email = email;
		this.passward = passward;

	}
	
	public Admin( String email, String passward) {
		super();
		this.email = email;
		this.passward = passward;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public List<Interviewee> getInterviewees() {
		return interviewees;
	}

	public void setInterviewees(List<Interviewee> interviewees) {
		this.interviewees = interviewees;
	}


	
	
}
