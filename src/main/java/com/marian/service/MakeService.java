package com.marian.service;

import java.util.List;

import com.marian.entity.CarMake;

public interface MakeService {

	void saveMaker(CarMake make);
	
	CarMake findMakeByName(String name);
	
	List<CarMake> findAllCarMake();
}
