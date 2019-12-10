package com.marian.entity.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @AllArgsConstructor
public enum Fuel {
	DISEL("DISEL"),
	PETROL("PETROL"),
	GAS("GAS"),
	ELECTRO("ELECTRO"),
	PETROL_GAS("PETROL/GAS"),
	PETROL_ELECTRO("PERTOL/ELECTRO");
	
	private Fuel(String type) {
		this.type = type;
	}

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
