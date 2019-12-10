package com.marian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.entity.CarModel;
import com.marian.repository.CarRepository;

public interface CarService {
	

	void saveCar(CarModel carModel);
	
	void updateCar(CarModel carModel);
	
	CarModel getCarById(int id);
	
	List<CarModel> findAllCar();
}
