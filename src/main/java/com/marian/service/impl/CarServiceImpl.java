package com.marian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.entity.CarModel;
import com.marian.repository.CarRepository;
import com.marian.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	
	@Autowired CarRepository carRepository;
	
	@Override
	public void saveCar(CarModel carModel) {
		carRepository.save(carModel);
		
	}

	@Override
	public void updateCar(CarModel carModel) {
		carRepository.save(carModel);
		
	}

	@Override
	public CarModel getCarById(int id) {
		// TODO Auto-generated method stub
		return carRepository.findOne(id);
	}

	@Override
	public List<CarModel> findAllCar() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

}
