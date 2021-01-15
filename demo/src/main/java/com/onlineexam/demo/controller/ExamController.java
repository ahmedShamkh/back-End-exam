package com.onlineexam.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexam.demo.entity.Exam;
import com.onlineexam.demo.service.ExamService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/Exam")
public class ExamController {

	@Autowired
	private ExamService examService;

	@GetMapping(value = "/all")
	public List<Exam> getAll() {
		try {
			return examService.getAll();
		} catch (Exception e) {
			System.out.println("failed to get all exams");
			return null;
		}

	}

	@GetMapping(value = "/{name}")
	public ResponseEntity<?> getByName(@PathVariable("name") String name) {

		return new ResponseEntity<>(examService.getExamByName(name), HttpStatus.OK);

	}

	@PostMapping(value = "/add")
	public Exam addExam(@RequestBody Exam exam) {
		try {
			return examService.addExam(exam);
		} catch (Exception e) {
			System.out.println("failed to add exam");
			return null;
		}
	}

	@PostMapping(value = "/update_examby_name")
	public void updateExamName(@RequestBody Exam exam) {
		try {
			examService.updateExamName(exam.getId(), exam.getName());
		} catch (Exception e) {
			System.out.println("failed to update exam");
		}

	}

	@PostMapping(value = "/update_examby_grade")
	public void updateExamGrade(@RequestBody Exam exam) {
		try {
			examService.updateExamGrade(exam.getId(), exam.getFinalGrade());
		} catch (Exception e) {
			System.out.println("failed to update grade of exam");
		}
	}

	@PostMapping(value = "/update_examby_time")
	public void updateExamTimer(@RequestBody Exam exam) {
		try {
			examService.updateExamTimer(exam.getId(), exam.getTime());
		} catch (Exception e) {
			System.out.println("failed to update time of exam");
		}
	}

	@PostMapping(value = "/update")
	public void updateExam(@RequestBody Exam exam) {
		try {
			examService.updateExam(exam.getId(), exam.getName(), exam.getFinalGrade(), exam.getTime());
		} catch (Exception e) {
			System.out.println("failed to update exam");
		}
	}

	@GetMapping(value = "/getById/{id}")
	public Optional<Exam> getById(@PathVariable("id") int id) {
		try {
			return examService.getById(id);
		} catch (Exception e) {
			System.out.println("failed to get exam");
			return null;
		}

	}

}
