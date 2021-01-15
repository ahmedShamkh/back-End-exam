package com.onlineexam.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.demo.entity.ExamInterviwee;

@Repository

public interface IntervieweeExamRepo extends JpaRepository<ExamInterviwee, Integer>{
	
	@Modifying
	@Transactional
	@Query(value= "insert into onlineexam.exam_has_interviwee "
			+ " (interviewee_id, exam_id, date)"
			+ "VALUES"
			+ " (?1, ?2, CURRENT_TIMESTAMP())"
			,nativeQuery=true)
	public void setDate(int interviewee_id, int exam_id);


	@Modifying
	@Transactional
	@Query(value= "UPDATE `onlineexam`.`exam_has_interviwee` " + 
			"SET " + 
			"`grade` = ?1 " + 
			"WHERE `interviewee_id` =?3 And `exam_id` = ?2"
			,nativeQuery=true)
	
	public void setGrade(float finalGrade, int exam_id, int interviewee_id);

}
