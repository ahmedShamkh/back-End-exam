package com.onlineexam.demo.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.demo.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository <Question, Integer>{
	
	/*
	@Modifying
	@Transactional
	@Query(value= "insert into onlineexam.question "
			+ "(`Text`,`Answer1`,`Answer2`,`Answer3`,`Answer4`,"
			+ "`Weight`,"
			+ "`isAnswer1`,`isAnswer2`,`isAnswer3`,`isAnswer4`,"
			+ "`EXAM_id`) "
			+ "VALUES "
			+ "(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11)"
			,nativeQuery=true)
	public void add(String text,String answer1, String answer2, String answer3, String answer4, int weight,
			boolean isAnswer1 , boolean isAnswer2,  boolean isAnswer3, boolean isAnswer4, int examId);
*/


	@Modifying
	@Transactional
	@Query(value= "insert into question "
			+ "(`Text`," + 
			"`Answer1`," + 
			"`Answer2`," + 
			"`Answer3`," + 
			"`Answer4`," + 
			"`Weight`," + 
			"`EXAM_id`," + 
			"`is_answer1`," + 
			"`is_answer2`," + 
			"`is_answer3`," + 
			"`is_answer4`) "
			+ "VALUES "
			+ "(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11)"
			,nativeQuery=true)
	public void add(String text,String answer1, String answer2, String answer3, String answer4, int weight,
			 int examId, int isAnswer1 , int isAnswer2,  int isAnswer3, int isAnswer4);
	
	
			
			

	@Modifying
	@Transactional
	@Query(value= "update question "+
	          "SET "
			+ "`Text` = ?1," + 
			"`Answer1` = ?2," + 
			"`Answer2`= ?3," + 
			"`Answer3` = ?4," + 
			"`Answer4` = ?5," + 
			"`Weight` = ?6," + 
			"`is_answer1` = ?7," + 
			"`is_answer2` = ?8," + 
			"`is_answer3` = ?9," + 
			"`is_answer4`= ?10 "
			+ "WHERE `id` = ?11"
			,nativeQuery=true)
	public void update(String text,String answer1, String answer2, String answer3, String answer4, int weight,
			 int isAnswer1 , int isAnswer2,  int isAnswer3, int isAnswer4, int questionId);
	
	

	@Query(value="SELECT * FROM question WHERE EXAM_id = ?1"
			,nativeQuery=true)
	public List<Question> getByExamId(int examId);
	
}
