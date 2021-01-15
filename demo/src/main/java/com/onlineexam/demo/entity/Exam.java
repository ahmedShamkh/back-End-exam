package com.onlineexam.demo.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Time")
	private Float time;
	
	@Column(name = "Final_Grade")
	private int finalGrade;
	

	@OneToMany(mappedBy = "exam")
	@JsonIgnore
	private List<Question> questions;

	
	@OneToMany(mappedBy = "exam")
	@JsonIgnore
	private List<ExamInterviwee> examInterviwees;
	
	public Exam() {
		
	}

	public Exam(String name, Float time, int finalGrade) {
		super();
		this.name = name;
		this.time = time;
		this.finalGrade = finalGrade;
	
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


	public Float getTime() {
		return time;
	}


	public void setTime(Float time) {
		this.time = time;
	}


	public int getFinalGrade() {
		return finalGrade;
	}


	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}


	public List<Question> getQuestions() {
		return questions;
	}


	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}


	
	public List<ExamInterviwee> getExamInterviwees() {
		return examInterviwees;
	}


	public void setExamInterviwees(List<ExamInterviwee> examInterviwees) {
		this.examInterviwees = examInterviwees;
	}


	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + ", time=" + time + ", finalGrade=" + finalGrade + ", questions="
				+ questions + "]";
	}

	

}
