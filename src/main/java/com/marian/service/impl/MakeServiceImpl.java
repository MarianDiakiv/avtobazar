package com.marian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.entity.CarMake;
import com.marian.repository.MakerRepository;
import com.marian.service.MakeService;

@Service
public class MakeServiceImpl implements MakeService {
	
	@Autowired
	private MakerRepository  makerRepository;
	
	@Override
	public void saveMaker(CarMake make) {
		makerRepository.save(make);
		
	}

	@Override
	public CarMake findMakeByName(String name) {
		// TODO Auto-generated method stub
		return makerRepository.findMakerByName(name);
	}

	@Override
	public List<CarMake> findAllCarMake() {
		
		return makerRepository.findAll();
	}

}
