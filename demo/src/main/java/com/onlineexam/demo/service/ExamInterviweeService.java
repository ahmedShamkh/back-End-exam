package com.onlineexam.demo.service;

public interface ExamInterviweeService {
	
	
	public void setDate(int interviewee_id, int exam_id);
	
	public void setGrade(float finalGrade, int exam_id, int interviewee_id);

}
