package com.marian.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marian.entity.Custom;
import com.marian.entity.UserEntity;
import com.marian.service.CarService;
import com.marian.service.CustomService;
import com.marian.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {

	@Autowired private UserService userService;
	@Autowired private CustomService customServise;
	
	@GetMapping("/profile")
	//@PreAuthorize("hasRole('ROLE_USER')")
	public String showUserPage(Principal priytipal, Model model) {
		UserEntity entity = userService.findUserByEmail(priytipal.getName());
		model.addAttribute("user", entity);
		
		List<Custom> userCarList = customServise.findUserCustoms(false, entity.getId());
		model.addAttribute("userCarListModel", userCarList);
		
		return"user/user_profile";
	}
	
	
//	public  String customCar() {
//		return"user/user_profile";
//	}

}
