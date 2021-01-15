package com.onlineexam.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.demo.entity.Interviewee;
import com.onlineexam.demo.reposatory.IntervieweeRepo;

@Service
public class IntervieweeServiceImp implements IntervieweeService {
	
	private IntervieweeRepo intervieweeRepo;
	
	@Autowired
	public IntervieweeServiceImp(IntervieweeRepo intervieweeRepo) {
		this.intervieweeRepo = intervieweeRepo;
	}

	
	@Override
	public List<Interviewee> findAll() {
		return intervieweeRepo.findAll();
	}

/*
	@Override
	public Interviewee addInterviewee(Interviewee interviewee) {
		return intervieweeRepo.save(interviewee);
	}
	*/


	@Override
	public void addInterviewee(String name, String email, String faculty, String phone1, String phone2, String add,
			int adminId, int levelId) {
		 intervieweeRepo.save(name, email, faculty, phone1, phone2, add, adminId, levelId);
	}


	@Override
	public Interviewee findById(int id) {
		return intervieweeRepo.findOneById(id);
	}


	@Override
	public List<Interviewee> findByName(String name) {
		return intervieweeRepo.findByName(name);
	}


	@Override
	public Interviewee add(Interviewee interviewee) {
		// TODO Auto-generated method stub
		return intervieweeRepo.save(interviewee);
	}
	
	
}
