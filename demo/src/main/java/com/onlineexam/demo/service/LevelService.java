package com.onlineexam.demo.service;

import java.util.List;

import com.onlineexam.demo.entity.Level;


public interface LevelService {

	public Level findById(int id);
	
	public List<Level> findAll();
	

}
