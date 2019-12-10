package com.marian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marian.entity.CarMake;
import com.marian.entity.CarModel;

public interface CarMakerRepository extends JpaRepository<CarMake, Integer> {

}
