package com.onlineexam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexam.demo.entity.Level;
import com.onlineexam.demo.service.LevelService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/Level")
public class LevelController {

	@Autowired
	LevelService levelService;
	
	@GetMapping("/all")
	public List<Level> getAll(){
		try {
		   return levelService.findAll();
		}catch(Exception e) {
			System.out.println("failed to get levels");
			return null;
		}
	}
	
}
