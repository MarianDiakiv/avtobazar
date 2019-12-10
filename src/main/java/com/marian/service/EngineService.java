package com.marian.service;

import java.util.List;

import com.marian.entity.Engine;

public interface EngineService {
	void saveEngine(Engine engine);
	
	List<Engine> findAllEngine();

}
