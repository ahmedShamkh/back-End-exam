package com.onlineexam.demo.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.demo.entity.Interviewee;

@Repository
public interface IntervieweeRepo  extends JpaRepository<Interviewee, Integer>{
//"(:name, :email, :faculty, :phone1, :phone2, ;add, :adminId, :levelId)"
	
	@Modifying
	@Transactional
	@Query(value= "insert into onlineexam.interviewee "
			+ "(`Name`,`Email`,`Faculty`,`Phone Number 1`,`Phone Number 2`,`Address`,`ADMIN_id`,`LEVEL_id`) "
			+ "VALUES "
			+ "(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)"
			,nativeQuery=true)
	public void save(String name,String email, String faculty, String phone1, String phone2,
			String add, int adminId,  int levelId);
	
	@Query(value= "Select * from interviewee",nativeQuery=true)
	public Interviewee get();
	
	
	@Query(value= "Select * from interviewee where (id = :id)",nativeQuery=true)
	public Interviewee findOneById(@Param(value = "id")int id);
	
	@Query(value= "Select * from interviewee where Name LIKE %:name%",nativeQuery=true)
	public List<Interviewee> findByName(@Param(value = "name") String name);
}
