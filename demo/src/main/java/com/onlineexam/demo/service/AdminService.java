package com.onlineexam.demo.service;

import java.util.List;

import com.onlineexam.demo.entity.Admin;

public interface AdminService {
	
	public Admin login(String email, String passward);
	
	public Admin addAdmin(Admin admin);
	
	public Admin findById(int id);
	
	public List<Admin> findAll();

	
}
