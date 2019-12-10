package com.marian.service;

import java.util.List;

import com.marian.entity.Custom;

public interface CustomService {
	
	void saveCustom(Custom custom);
	
	List<Custom> findAllCustom();
	
	List<Custom> findAllCustomByStatus(boolean status);
	
	Custom findOneCustonById(int id);
	
	List<Custom> findUserCustoms(boolean status, int userId);
	
	

}
