package com.onlineexam.demo.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "[Interviewee]")


public class Interviewee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="[id]")
	private int id;
	
	
	@Column(name="[Name]")
	private String name;
	
	@Column(name="[Email]")
	private String email;
	
	@Column(name="[Faculty]")
	private String faculty;
	
	@Column(name="[Address]")
	private String address;
	
	@Column(name="[Phone Number 1]")
	private String phone_number1;
	
	@Column(name="[Phone Number 2]")
	private String phone_number2;
	
	@ManyToOne
	@JoinColumn(name = "[ADMIN_id]")
	//@JsonIgnore
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "[LEVEL_id]")
	//@JsonIgnore
	private Level level;
	
	@OneToMany(mappedBy = "interviewee", cascade=CascadeType.ALL)
     //@JsonIgnore
	private List<ExamInterviwee> ExamInterviwees;

	
	public Interviewee() {
		
	}
	

	
	public Interviewee( String name, String email, String faculty, String address, String phone_number1, String phone_number2) {
		super();
		this.name = name;
		this.email = email;
		this.faculty = faculty;
		this.address = address;
		this.phone_number1 = phone_number1;
		this.phone_number2 = phone_number2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<ExamInterviwee> getExamInterviwees() {
		return ExamInterviwees;
	}

	public void setExamInterviwees(List<ExamInterviwee> examInterviwees) {
		ExamInterviwees = examInterviwees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number1() {
		return phone_number1;
	}

	public void setPhone_number1(String phone_number1) {
		this.phone_number1 = phone_number1;
	}

	public String getPhone_number2() {
		return phone_number2;
	}

	public void setPhone_number2(String phone_number2) {
		this.phone_number2 = phone_number2;
	}

	@Override
	public String toString() {
		return "Interviewee [id=" + id + ", admin=" + admin + ", level=" + level + ", ExamInterviwees="
				+ ExamInterviwees + ", name=" + name + ", email=" + email + ", faculty=" + faculty + ", address="
				+ address + ", phone_number1=" + phone_number1 + ", phone_number2=" + phone_number2 + "]";
	}


	
	
	
	

}
