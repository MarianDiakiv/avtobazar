package com.marian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marian.entity.CarModel;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {
	@Query("SELECT c From CarModel c Where c.model = :model")
	CarModel findByModel(@Param("model") String model);

}
