package com.onlineexam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexam.demo.entity.ExamInterviwee;
import com.onlineexam.demo.service.ExamInterviweeService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/IntervieweeExam")
public class IntervieweeExamController {
	
	
	@Autowired
	ExamInterviweeService examInterviweeService;
	
	@PostMapping(value = "/Date/{exam_id}/{interviewee_id}")
	public void setDate(@PathVariable("exam_id") int exam_id, @PathVariable("interviewee_id") int interviewee_id) {
		examInterviweeService.setDate(exam_id,interviewee_id);
	}
	
	@PutMapping(value="/update/{exam_id}/{interviewee_id}")
	public void setGrade(@PathVariable("exam_id") int exam_id, @PathVariable("interviewee_id") int interviewee_id
			,@RequestBody ExamInterviwee examInterviwee) {
		examInterviweeService.setGrade(examInterviwee.getGrade(), exam_id, interviewee_id);
		
	}
	

}
