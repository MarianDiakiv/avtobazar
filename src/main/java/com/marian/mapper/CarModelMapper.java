package com.marian.mapper;


import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import com.marian.domain.CreateCarRequest;
import com.marian.domain.EditCarRequest;
import com.marian.entity.CarModel;

public interface CarModelMapper {

	public static CarModel addRequestToCarModel(CreateCarRequest request) {
		
		CarModel car = new CarModel();
		car.setModel(request.getModel());
		car.setPrice(request.getPrice());
		car.setYear(request.getYear());
		car.setOptions(request.getOptions());
		car.setDescriptions(request.getDescriptions());
		car.setColor(request.getColor());
		car.setEngine(request.getEngine());
		car.setBodyType(request.getBodyType());
		car.setCarMake(request.getCarMake());
		car.setFuel(request.getFuel());
		//car.setImage(request.getCarImage().getOriginalFilename());
		return car;
	}
	
	public  static CreateCarRequest entityToCarCreateRequest(CarModel carModel) {
		
		CreateCarRequest request = new CreateCarRequest();
		
		request.setModel(carModel.getModel());
		request.setPrice(carModel.getPrice());
		request.setYear(carModel.getYear());
		request.setOptions(carModel.getOptions());
		request.setDescriptions(request.getDescriptions());
		request.setColor(carModel.getColor());
		request.setEngine(carModel.getEngine());
		request.setBodyType(carModel.getBodyType());
		request.setCarMake(carModel.getCarMake());
		request.setFuel(carModel.getFuel());
		//request.setCarImage(carModel.getImage());
		//request.setImage(carModel.getImage());
		return request;
		
		
	}
	
	
	 public static CarModel editCarToEntity(EditCarRequest request) {
		CarModel model = new CarModel();
		model.setId(request.getId());
		model.setModel(request.getModel());
		model.setYear(request.getYear());
		model.setOptions(request.getOptions());
		model.setDescriptions(request.getDescriptions());
		model.setPrice(request.getPrice());
		model.setColor(request.getColor());
		model.setEngine(request.getEngine());
		model.setBodyType(request.getBodyType());
		model.setCarMake(request.getCarMake());
		//model.setId(request.getId());
		return model;
	}
	 public static EditCarRequest carToRequest(CarModel model) {
		 
		 EditCarRequest request = new EditCarRequest();
		 request.setId(model.getId());
		 request.setModel(model.getModel());
		 request.setOptions(model.getOptions());
		 request.setYear(request.getYear());
		 request.setDescriptions(model.getDescriptions());
		 request.setPrice(model.getPrice());
		 request.setColor(model.getColor());
		 request.setEngine(model.getEngine());
		 request.setBodyType(model.getBodyType());
		 request.setCarMake(model.getCarMake());
		 
		 return request;
	 }
}
