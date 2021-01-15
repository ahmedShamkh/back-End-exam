package com.onlineexam.demo.service;

import java.util.List;
import java.util.Optional;

import com.onlineexam.demo.entity.Question;

public interface QuestionService {
	
	//GetAll
	public List<Question> getAll();
	
	
	public Optional<Question> getById(int id);
	
	
	public List<Question> getByExamId(int id);

	//Addquestion
	public void add(String text,String answer1, String answer2, String answer3, String answer4, int weight,
			 int examId, int isAnswer1 , int isAnswer2,  int isAnswer3, int isAnswer4);

	
	//public Question save(Question question);
	 
	public void update(String text,String answer1, String answer2, String answer3, String answer4, int weight,
			 int isAnswer1 , int isAnswer2,  int isAnswer3, int isAnswer4, int questionId);
	
	
	public void delete(int id);
	
	
}
