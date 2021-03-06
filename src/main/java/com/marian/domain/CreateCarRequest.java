package com.marian.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.marian.entity.CarMake;
import com.marian.entity.Engine;
import com.marian.entity.enumeration.BodyType;
import com.marian.entity.enumeration.Fuel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class CreateCarRequest {
	
	public CreateCarRequest() {
		super();
	}
	@NotEmpty private String model;
	@NotEmpty private int price;
	@NotEmpty private String year;
	@NotEmpty private String options;//комплектація
	@NotEmpty private String descriptions;//опис по моелі 
	@NotEmpty private String color;
	@NotEmpty private Engine engine;
	@NotEmpty private CarMake carMake;
	@NotEmpty private BodyType bodyType;
	@NotEmpty private Fuel fuel;
	@NotEmpty private MultipartFile carImage;
	@Override
	public String toString() {
		return "CreateCarRequest [model=" + model + ", price=" + price + ", year=" + year + ", options=" + options
				+ ", descriptions=" + descriptions + ", color=" + color + ", engine=" + engine + ", carMake=" + carMake
				+ ", bodyType=" + bodyType + ", carImage=" + carImage.getOriginalFilename() + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public CarMake getCarMake() {
		return carMake;
	}
	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}
	public BodyType getBodyType() {
		return bodyType;
	}
	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	public MultipartFile getCarImage() {
		return carImage;
	}
	public void setCarImage(MultipartFile carImage) {
		this.carImage = carImage;
	}
}
