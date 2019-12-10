package com.marian.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marian.entity.Custom;

@Repository
public interface CustomRepository extends JpaRepository<Custom, Integer> {
	
	@Query("SELECT c FROM Custom c WHERE c.status = :status")
	List<Custom> findCustomByStatus(@Param("status") boolean status);
	@Query("SELECT c From Custom c WHERE c.id = :userid and c.status = :status")
	List<Custom> findUserCustom(@Param("status") boolean status,@Param("userid") int userid);

}
