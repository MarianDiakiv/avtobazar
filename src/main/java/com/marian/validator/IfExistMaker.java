package com.marian.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.marian.service.CarMakerServise;

public class IfExistMaker implements ConstraintValidator<IfExistCarMaker, String> {

	@Autowired CarMakerServise carMakerServise;
	@Override
	public void initialize(IfExistCarMaker arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String title, ConstraintValidatorContext context) {
		if (carMakerServise.findAll()!=null) {
			return false;
		}
		else {
		return true;
		}
	}

}
