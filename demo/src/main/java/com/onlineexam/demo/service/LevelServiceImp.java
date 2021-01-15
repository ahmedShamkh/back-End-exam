package com.onlineexam.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.demo.entity.Level;
import com.onlineexam.demo.reposatory.LevelRepo;

@Service
public class LevelServiceImp implements LevelService{

	@Autowired 
	LevelService levelService;
	
	@Autowired
	private LevelRepo levelRepo;

	
	@Override
	public Level findById(int id) {
		return levelRepo.findOneById(id);
	}


	@Override
	public List<Level> findAll() {
		// TODO Auto-generated method stub
		return levelRepo.findAll();
	}

}
