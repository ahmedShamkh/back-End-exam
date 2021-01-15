package com.onlineexam.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineexam.demo.entity.Admin;
import com.onlineexam.demo.service.AdminService;


@RestController
@RequestMapping(value = "/Admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	private AdminService adminService;
	
	@Autowired
	public AdminController(AdminService adminService) {
		
		this.adminService =  adminService;
		
	}
	
	@PostMapping(value = "/login")	
	public Admin login( @RequestBody Admin admin) {
		//System.out.println( admin.getEmail() + " "+admin.getPassward());
		try {
			return  adminService.login( admin.getEmail(), admin.getPassward());
		
		}catch(Exception e) {
			System.out.println("login failed");
			return null;
		}
		
		
	}
	
	@PostMapping(value = "/addAdmin")	
	public Admin addAdmin(@RequestBody Admin admin) {
		try {
		  return adminService.addAdmin(admin);
		}catch(Exception e) {
			System.out.println("add admin failed");
			return null;
		}
	}
	
	@GetMapping(value="/all")
	public List<Admin> getAll(){
		try {
		    return adminService.findAll();
		}catch(Exception e) {
			System.out.println("get all admins failed");
			return null;
		}
	}
	
}
