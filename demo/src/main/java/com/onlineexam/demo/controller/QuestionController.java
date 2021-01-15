package com.onlineexam.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexam.demo.entity.Question;
import com.onlineexam.demo.service.QuestionService;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RestController
@RequestMapping(value = "/Question")
public class QuestionController  {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping(value = "/all")
	public List<Question> getAll(){
		return questionService.getAll();
	}
	/*
	@GetMapping(value = "/one_by_id")
	public Optional<Question> getById(@RequestBody Question question){
		try {
			return questionService.getById(question.getId());
		}catch(Exception e) {
			System.out.println("can't get questions");
			return null;
		}
	}
	*/
	@GetMapping(value = "/one_by_id/{id}")
	public Optional<Question> getById(@PathVariable("id") int id){
		try {
			return questionService.getById(id);
		}catch(Exception e) {
			System.out.println("can't get questions");
			return null;
		}
	}
	
	
	@GetMapping(value = "/by_Exam_id/{examId}")
	public List<Question> getByExamId(@PathVariable("examId") int examId) {
		return questionService.getByExamId(examId);
	}
	
	@PostMapping("/add/{exam_id}")
	public void add(@PathVariable(value="exam_id") int exam_id, @RequestBody Question question) {
		
		questionService.add(question.getText(), 
				question.getAnswer1(), question.getAnswer2(),question.getAnswer3() , question.getAnswer4(),
				question.getWeight(), 
				 exam_id,
				question.getIsAnswer1(), question.getIsAnswer2(), question.getIsAnswer3(), question.getIsAnswer4());
		
	}
	
	@PutMapping("/update/{question_id}")
	public int update(@PathVariable(value="question_id") int question_id, @RequestBody Question question) {
		try {
			questionService.update(question.getText(),
					question.getAnswer1(), question.getAnswer2(),question.getAnswer3() , question.getAnswer4(),
					question.getWeight(), 
					question.getIsAnswer1(), question.getIsAnswer2(), question.getIsAnswer3(), question.getIsAnswer4(), question_id);
			return 1;

		}catch(Exception e) {
			return 0;
		}
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Question question) {
		questionService.delete(question.getId());
	}
	
	
	@PostMapping("/get")
	public List<Question> get(@RequestBody List<Question> q){
		return q;
		
	}
	
}
