package com.marian.controller;


import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marian.entity.CarModel;
import com.marian.entity.Custom;
import com.marian.entity.UserEntity;
import com.marian.service.CarService;
import com.marian.service.CustomService;
import com.marian.service.UserService;

@Controller
@RequestMapping("/cars")
public class CarControler {
@Autowired private CarService carService;
@Autowired private  UserService userServise;
@Autowired private CustomService customServise;

@GetMapping("/carlist")
private String showCarListAdmin(Model model, Principal principal ) {
	
	UserEntity userEntity = userServise.findUserByEmail(principal.getName());
	List<CarModel> carModelList = carService.findAllCar();
	model.addAttribute("UserEntytiModel", userEntity);
	model.addAttribute("carList", carModelList);		
	return"car_list";
}
@GetMapping("/user/{userid}/info/{carid}")
public String showInfoByCar(@PathVariable("carid") int carId, @PathVariable("userid") int userId,  Model model, Principal principal) {
	CarModel carModel = carService.getCarById(carId);
	UserEntity userEntity = userServise.findUserById(userId);
	
	if(carId!=carModel.getId()){
		return"redirect:/cars/carlist";
	}
	model.addAttribute("userModel", userEntity);
	model.addAttribute("carModelInfo", carModel);
	return "car-info";
}

@PostMapping("/user/{userid}/info/{carid}")
public String addCustom(@PathVariable("userid") int uderId,@PathVariable("carid") int carId ) {
	UserEntity userEntity = userServise.findUserById(uderId);
	CarModel carModel = carService.getCarById(carId);
	Custom custom = new Custom();
	custom.setModel(carModel);
	custom.setUser(userEntity);
	custom.setStatus(false);
	customServise.saveCustom(custom);
	
	return"redirect:/user/profile";
}
@GetMapping("/user/{userid}/buy/{carid}")
public String buyCar(@PathVariable("userid") int userId, @PathVariable("carid") int carId, Principal principal, Model model ) {
	
	 
	UserEntity userEntity = userServise.findUserByEmail(principal.getName());
	//model.addAttribute("userModel", userEntity);
	CarModel carModel = carService.getCarById(carId);
	Custom custom  = new Custom();
	custom.setModel(carModel);
	custom.setUser(userEntity);
	custom.setStatus(false);
	customServise.saveCustom(custom);
	return "redirect/user/profile";
}
	
}
