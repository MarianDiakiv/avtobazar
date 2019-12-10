package com.marian.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.marian.entity.enumeration.BodyType;
import com.marian.entity.enumeration.Fuel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="car_model")
@Getter @Setter @NoArgsConstructor
public class CarModel extends BaseEntity{


	public CarModel() {
		super();
	}

	private String model;
	private int price;
	private String year;
	private String options;//комплектація
	private String descriptions;//опис по моелі 
	private String color;
	private String image;

	
	@ManyToOne(cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="engine_id")
	private Engine engine;
	
	@ManyToOne(cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="make_id")
	private CarMake carMake;
	
	@Enumerated(EnumType.STRING)
	private BodyType bodyType;
	@Enumerated(EnumType.STRING)
	private Fuel fuel;

	@OneToMany(mappedBy="model", cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	private List<Custom> custom;

	@Override
	public String toString() {
		return "CarModel [model=" + model + ", price=" + price + ", year=" + year + ", options=" + options
				+ ", descriptions=" + descriptions + ", color=" + color + ", image=" + image + ", engine=" + engine
				+ ", carMake=" + carMake + ", bodyType=" + bodyType + ", custom=" + custom + "]";
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public List<Custom> getCustom() {
		return custom;
	}

	public void setCustom(List<Custom> custom) {
		this.custom = custom;
	}
	
}
