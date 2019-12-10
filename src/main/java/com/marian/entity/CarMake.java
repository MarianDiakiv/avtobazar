package com.marian.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.marian.validator.IfExistCarMaker;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="car_make")
@Getter @Setter @NoArgsConstructor
public class CarMake extends BaseEntity {
public CarMake() {
		super();
	}

//@NotEmpty
@IfExistCarMaker(message="This maker already exists")
private String title;
	
	@OneToMany(mappedBy="carMake", cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	List<CarModel> cars = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<CarModel> getCars() {
		return cars;
	}

	public void setCars(List<CarModel> cars) {
		this.cars = cars;
	} 

}
