package com.onlineexam.demo.service;

import java.util.List;
import java.util.Optional;

import com.onlineexam.demo.dto.ExamDto;
import com.onlineexam.demo.entity.Exam;

public interface ExamService {
	
	public List<Exam> getAll();
	
	public Optional<Exam> getById(int id);
	
	public Exam addExam(Exam exam);
	
	public ExamDto getExamByName(String name);
	
	public void updateExamName(int id, String name);
	
	public void updateExamGrade(int id, int garde);
	
	public void updateExamTimer(int id, float timer);

	public void updateExam(int id, String name, int grade, float timer);

}
