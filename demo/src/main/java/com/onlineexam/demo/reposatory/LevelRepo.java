package com.onlineexam.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onlineexam.demo.entity.Level;

@Repository
public interface LevelRepo extends JpaRepository <Level, Integer>{
	
	@Query(value= "Select * from level where (id = :id)",nativeQuery=true)
	public Level findOneById(@Param(value = "id")int id);
	
	

}
