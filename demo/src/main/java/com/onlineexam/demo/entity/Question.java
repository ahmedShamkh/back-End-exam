package com.onlineexam.demo.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "QUESTION")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="[id]")
	private int id;
	
	@Column(name = "[Weight]")	
	private int weight;
	
	@Column(name = "[Text]")
	private String text;
	
	@Column(name = "[Answer1]")
	private String Answer1;
	
	@Column(name = "[Answer2]")	
	private String Answer2;
	
	@Column(name = "[Answer3]")
	private String Answer3;
	
	@Column(name = "[Answer4]")
	private String Answer4;
	
	@Column(name = "[isAnswer1]")
	private int isAnswer1;
	
	@Column(name = "[isAnswer2]")
	private int isAnswer2;
	
	@Column(name = "[isAnswer3]")
	private int isAnswer3;
	
	@Column(name = "[isAnswer4]")
	private int isAnswer4;
	
	@ManyToOne
	@JoinColumn(name = "[EXAM_id]")
	@JsonIgnore
	private Exam exam;

	
	public Question() {
		
	}
	
	

	public Question(int weight, String text, String answer1, String answer2, String answer3, String answer4,
			int isAnswer1, int isAnswer2, int isAnswer3, int isAnswer4, Exam exam) {
		super();
		this.weight = weight;
		this.text = text;
		Answer1 = answer1;
		Answer2 = answer2;
		Answer3 = answer3;
		Answer4 = answer4;
		this.isAnswer1 = isAnswer1;
		this.isAnswer2 = isAnswer2;
		this.isAnswer3 = isAnswer3;
		this.isAnswer4 = isAnswer4;
		this.exam = exam;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAnswer1() {
		return Answer1;
	}
	public void setAnswer1(String answer1) {
		this.Answer1 = answer1;
	}
	public String getAnswer2() {
		return Answer2;
	}
	public void setAnswer2(String answer2) {
		Answer2 = answer2;
	}
	public String getAnswer3() {
		return Answer3;
	}
	public void setAnswer3(String answer3) {
		Answer3 = answer3;
	}
	public String getAnswer4() {
		return Answer4;
	}
	public void setAnswer4(String answer4) {
		Answer4 = answer4;
	}
	public int getIsAnswer1() {
		return isAnswer1;
	}
	public void setIsAnswer1(int isAnswer1) {
		this.isAnswer1 = isAnswer1;
	}
	public int getIsAnswer2() {
		return isAnswer2;
	}
	public void setIsAnswer2(int isAnswer2) {
		this.isAnswer2 = isAnswer2;
	}
	public int getIsAnswer3() {
		return isAnswer3;
	}
	public void setIsAnswer3(int isAnswer3) {
		this.isAnswer3 = isAnswer3;
	}
	public int getIsAnswer4() {
		return isAnswer4;
	}
	public void setIsAnswer4(int isAnswer4) {
		this.isAnswer4 = isAnswer4;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", weight=" + weight + ", text=" + text + ", Asnswer1=" + Answer1 + ", Asnswer2="
				+ Answer2 + ", Asnswer3=" + Answer3 + ", Asnswer4=" + Answer4 + ", isAnswer1=" + isAnswer1
				+ ", isAnswer2=" + isAnswer2 + ", isAnswer3=" + isAnswer3 + ", isAnswer4=" + isAnswer4 + ", exam="
				+ exam + "]";
	}
	
	
	
}
