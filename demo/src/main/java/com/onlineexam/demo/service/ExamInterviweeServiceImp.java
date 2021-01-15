package com.onlineexam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.demo.reposatory.IntervieweeExamRepo;

@Service
public class ExamInterviweeServiceImp implements ExamInterviweeService{
	
	@Autowired
	IntervieweeExamRepo intervieweeExamRepo;

	@Override
	public void setDate(int interviewee_id, int exam_id) {
		intervieweeExamRepo.setDate(interviewee_id, exam_id);
	}

	@Override
	public void setGrade(float finalGrade, int exam_id, int interviewee_id) {
		intervieweeExamRepo.setGrade(finalGrade, exam_id, interviewee_id);		
	}

}
