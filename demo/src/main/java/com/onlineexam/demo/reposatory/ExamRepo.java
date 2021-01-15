package com.onlineexam.demo.reposatory;

import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.demo.dto.ExamDto;
import com.onlineexam.demo.entity.Exam;

@Repository
public interface ExamRepo extends JpaRepository<Exam, Integer>{
	
	@Modifying
	@Transactional
	@Query(value= "update exam set Name = :name where id = :id",nativeQuery=true)
	public void updateExamName(@Param(value = "id") int id, @Param(value = "name") String name);
	
	


	@Modifying
	@Transactional
	@Query(value= "update exam set Final_Grade = :name where id = :id",nativeQuery=true)
	public void updateExamGrade(@Param(value = "id") int id, @Param(value = "name") int grade);

	@Modifying
	@Transactional
	@Query(value= "update exam set Time = :name where id = :id",nativeQuery=true)
	public void updateExamTimer(@Param(value = "id") int id, @Param(value = "name") float timer);

	@Modifying
	@Transactional
	@Query(value= "update exam set Name = :name, Final_Grade = :grade, Time = :time  where id = :id",nativeQuery=true)
	public void updateExam(@Param(value = "id") int id,  @Param(value = "name") String name,
			@Param(value = "time") float timer, @Param(value = "grade") int grade);
	
	//@Query("select new com.onlineexam.demo.dto.ExamDto(finalGrade,time) from Exam where name=:name")
	ExamDto findByNameIgnoreCase( String name);
	
	
	
	

}
