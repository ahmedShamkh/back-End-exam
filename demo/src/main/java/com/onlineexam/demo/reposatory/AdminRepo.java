package com.onlineexam.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onlineexam.demo.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	@Query(value= "Select * from admin where (Email = :Email) && (Passward = :Passward)",nativeQuery=true)
	public Admin login(@Param(value = "Email")String Email, @Param(value = "Passward")String Passward);
	
	@Query(value= "Select * from admin where (id = :id)",nativeQuery=true)
	public Admin findOneById(@Param(value = "id")int id);
		
}
