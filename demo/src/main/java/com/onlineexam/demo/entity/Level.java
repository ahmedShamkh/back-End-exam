package com.onlineexam.demo.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Level")
public class Level {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="type")	
	private String type;
	
	@OneToMany(mappedBy = "level")
	@JsonIgnore
	private List<Interviewee> interviewees;

	public Level() {
		
	}
	
	public Level(String type) {
		super();
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Interviewee> getInterviewees() {
		return interviewees;
	}

	public void setInterviewees(List<Interviewee> interviewees) {
		this.interviewees = interviewees;
	}

}
