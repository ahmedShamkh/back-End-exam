package com.onlineexam.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.demo.entity.Exam;
import com.onlineexam.demo.entity.Question;
import com.onlineexam.demo.reposatory.ExamRepo;
import com.onlineexam.demo.reposatory.QuestionRepo;

@Service
public class QuestionServiceImp  implements QuestionService{
	
	@Autowired
    QuestionRepo questionRepo;
	@Autowired
	ExamRepo examRepo;
	
	

	@Override
	public List<Question> getAll() {
		return questionRepo.findAll();
	}

	
	@Override
	public Optional<Question> getById(int id) {
		return questionRepo.findById(id);
	}
	
	@Override
	public List<Question> getByExamId(int id) {
		return questionRepo.getByExamId(id);
	}



	@Override
	public void add(String text, String answer1, String answer2, String answer3, String answer4, int weight, int examId,
			int isAnswer1, int isAnswer2, int isAnswer3, int isAnswer4) {
		Exam exam=examRepo.findById(examId).orElseThrow(()->new RuntimeException("no exam found with this id "+ examId));
		Question questions= new Question(weight, text, answer1, answer2, answer3, answer4, isAnswer1, isAnswer2, isAnswer3, isAnswer4, exam);
		questionRepo.save(questions);
	}

	@Override
	public void update(String text, String answer1, String answer2, String answer3, String answer4, int weight,
			int isAnswer1, int isAnswer2, int isAnswer3, int isAnswer4, int questionId) {
		questionRepo.update(text, answer1, answer2, answer3, answer4, weight, isAnswer1, isAnswer2, isAnswer3, isAnswer4, questionId);
		
	}

	@Override
	public void delete(int id) {
		questionRepo.deleteById(id);
	}

	
}
