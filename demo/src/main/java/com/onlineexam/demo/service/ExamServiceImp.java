package com.onlineexam.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.demo.dto.ExamDto;
import com.onlineexam.demo.entity.Exam;
import com.onlineexam.demo.reposatory.ExamRepo;

@Service
public class ExamServiceImp implements ExamService {

	@Autowired
	private ExamRepo examRepo;

	@Override
	public List<Exam> getAll() {
		return examRepo.findAll();
	}

	@Override
	public Exam addExam(Exam exam) {
		return examRepo.save(exam);
	}

	@Override
	public ExamDto getExamByName(String name) {
		return examRepo.findByNameIgnoreCase(name);
	}

	@Override
	public void updateExamName(int id, String name) {
		examRepo.updateExamName(id, name);
	}

	@Override
	public void updateExamGrade(int id, int grade) {
		examRepo.updateExamGrade(id, grade);
	}

	@Override
	public void updateExamTimer(int id, float timer) {
		examRepo.updateExamTimer(id, timer);
		;
	}

	@Override
	public void updateExam(int id, String name, int grade, float timer) {
		examRepo.updateExam(id, name, timer, grade);
	}

	@Override
	public Optional<Exam> getById(int id) {
		// TODO Auto-generated method stub
		return examRepo.findById(id);
	}

}
