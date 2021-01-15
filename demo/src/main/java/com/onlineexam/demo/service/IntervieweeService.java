package com.onlineexam.demo.service;

import java.util.List;

import com.onlineexam.demo.entity.Interviewee;

public interface IntervieweeService {
	
	
	public void addInterviewee(String name, String email,String faculty, String phone1, String phone2, String add, int adminId, int levelId);
	
	public List<Interviewee> findAll();
	
	public Interviewee findById(int id);
	
	public  List<Interviewee> findByName(String name);
	
	public Interviewee add(Interviewee interviewee);


}
