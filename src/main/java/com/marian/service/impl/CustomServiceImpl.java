package com.marian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.entity.Custom;
import com.marian.repository.CustomRepository;
import com.marian.service.CustomService;

@Service
public class CustomServiceImpl implements CustomService {

	@Autowired
	private CustomRepository customRepository;
	
	@Override
	public void saveCustom(Custom custom) {
		customRepository.save(custom);
		
	}

	@Override
	public List<Custom> findAllCustom() {
		// TODO Auto-generated method stub
		return customRepository.findAll();
	}

	@Override
	public List<Custom> findAllCustomByStatus(boolean status) {
		// TODO Auto-generated method stub
		return  customRepository.findCustomByStatus(false);
	}

	@Override
	public Custom findOneCustonById(int id) {
		// TODO Auto-generated method stub
		return customRepository.findOne(id);
	}

	@Override
	public List<Custom> findUserCustoms(boolean status, int userId) {
		
		return customRepository.findUserCustom(status, userId);
	}

}
