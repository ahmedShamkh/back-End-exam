package com.onlineexam.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexam.demo.entity.Interviewee;
import com.onlineexam.demo.service.AdminService;
import com.onlineexam.demo.service.IntervieweeService;
import com.onlineexam.demo.service.LevelService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/Interviewee")
public class IntervieweeController {
	
	@Autowired
	private IntervieweeService intervieweeService;
	
	@Autowired
	private LevelService levelService;
	
	@Autowired
	private AdminService adminService ;
	
	@PostMapping(value = "/add/{adminId}/{levelId}")	
	public int add(@PathVariable(value = "adminId") int adminId,@PathVariable(value = "levelId") int levelId,
	              @Valid @RequestBody Interviewee interviewee) {
		
		try {
			intervieweeService.addInterviewee(interviewee.getName(), interviewee.getEmail(),interviewee.getFaculty(),
					interviewee.getPhone_number1(), interviewee.getPhone_number2(), interviewee.getAddress(),
					adminId, levelId);
			return 1;
		}catch(Exception e) {
			System.out.println("failed to insert new interviewee");
			return 0;
		}
	

	}
	/*
	@PostMapping(value = "/addd/{adminId}/{levelId}")	
	public Interviewee adddI(@PathVariable(value = "adminId") int adminId,@PathVariable(value = "levelId") int levelId,
	              @Valid @RequestBody Interviewee interviewee) {
		
		Admin admin =  adminService.findById(adminId);
	    Level  level= levelService.findById(levelId);

		
		System.out.println(level.getId() +" "+ admin.getId());
		
		interviewee.setLevel(level);
		interviewee.setAdmin(admin);
		
		Interviewee interviewee2 = intervieweeService.add(interviewee);
		
		return interviewee2;
  }
  
*/
	@GetMapping(value = "/all")	
	public List<Interviewee> getInterviewee( ) {
		return intervieweeService.findAll();
	}
	
	@GetMapping(value = "/by_id/{id}")	
	public Interviewee getIntervieweeById(@PathVariable (value = "id") int id) {
		return intervieweeService.findById(id);
	}
	

	@GetMapping(value = "/by_name/{name}")	
	public List<Interviewee> getIntervieweeByName(@PathVariable (value = "name") String name) {
		return intervieweeService.findByName(name);
	}}
