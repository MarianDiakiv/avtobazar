package com.marian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.entity.CarMake;
import com.marian.repository.CarMakerRepository;
import com.marian.service.CarMakerServise;

@Service
public class CarModelServiseImpl implements CarMakerServise {
	@Autowired
 CarMakerRepository makerRepository;

	@Override
	public List<CarMake> findAll() {
		
		return makerRepository.findAll();
	}

}
