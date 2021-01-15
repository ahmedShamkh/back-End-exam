package com.onlineexam.demo.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Exam_has_interviwee")
public class ExamInterviwee {
//implements Serializable{
	

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="[id]")
	private int id;
	
	//@Id
    @ManyToOne
    @JoinColumn(name = "EXAM_id")
	private Exam exam;
	
	//@Id
    @ManyToOne
    @JoinColumn(name = "INTERVIEWEE_id")
	@JsonIgnore
	private Interviewee interviewee;
	
	@Column(name = "Grade")
	private int grade;
	
	@Column(name = "Date")
	private String date;

	public ExamInterviwee() {
		
	}
	public ExamInterviwee(Exam exam, Interviewee interviewee, int grade, String date) {
		super();
		this.exam = exam;
		this.interviewee = interviewee;
		this.grade = grade;
		this.date = date;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Interviewee getInterviewee() {
		return interviewee;
	}

	public void setInterviewee(Interviewee interviewee) {
		this.interviewee = interviewee;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ExamInterviwee [exam=" + exam + ", interviewee=" + interviewee + ", grade=" + grade + ", date=" + date
				+ "]";
	}
	
	

}
