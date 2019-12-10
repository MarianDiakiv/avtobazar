package com.marian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marian.entity.Engine;

@Repository
public interface EngineRepository extends JpaRepository<Engine, Integer> {

	@Query("Select e from Engine e where title = :title")
	Engine findEngineByTitle( @Param("title")String title);
}
