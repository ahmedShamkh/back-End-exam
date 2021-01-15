package com.onlineexam.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.onlineexam.demo.entity.Admin;
import com.onlineexam.demo.reposatory.AdminRepo;

@Service
public class AdminServiceImp implements AdminService {
	
	private AdminRepo adminRepo;
	
	@Autowired
	public AdminServiceImp(AdminRepo adminRepo) {
		this.adminRepo = adminRepo;
	}

	@Override
	public Admin login(String email, String passward) {
	    Admin admin =  adminRepo.login(email, passward);
		return admin;
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public Admin findById(int id) {
		return adminRepo.findOneById(id);
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}




}
