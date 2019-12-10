package com.marian.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="engine")
@Getter @Setter @NoArgsConstructor
public class Engine extends BaseEntity {
	public Engine() {
		super();
	}


	@NotNull(message="cant be null") 
	private String title;
	@NotNull(message="cant be null") 
	private String power;
	@NotNull(message="cant be null") 
	private String capacity;

	
	@OneToMany(mappedBy="engine", cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	List<CarModel> models = new ArrayList<>();


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPower() {
		return power;
	}


	public void setPower(String power) {
		this.power = power;
	}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public List<CarModel> getModels() {
		return models;
	}


	public void setModels(List<CarModel> models) {
		this.models = models;
	} 

}
