package com.marian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.entity.Engine;
import com.marian.repository.EngineRepository;
import com.marian.service.EngineService;

@Service
public class EngineServiseImpl implements EngineService {

	@Autowired EngineRepository engineRepository;
	@Override
	public void saveEngine(Engine engine) {
		engineRepository.save(engine);
		
	}

	@Override
	public List<Engine> findAllEngine() {
		// TODO Auto-generated method stub
		return engineRepository.findAll();
	}

}
