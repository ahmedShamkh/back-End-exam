package com.onlineexam.demo.dto;

public class ExamDto {

	private int finalGrade;
	private Float time;

	public ExamDto(int finalGrade, Float time) {
		this.finalGrade = finalGrade;
		this.time = time;
	}
	

//	public ExamDto(int finalGrade) {
//		this.finalGrade = finalGrade;
//	}


	public int getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

}
