package com.marian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marian.entity.CarMake;
@Repository
public interface MakerRepository extends JpaRepository<CarMake, Integer> {

	@Query("Select m from CarMake m Where m.title = :title")
	CarMake findMakerByName(@Param("title") String title);
}
