package com.marian.entity.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum BodyType {
	SEDAN("SEDAN"), PICKUP("PICKUP"), HATCHBACK("HATCHBACK"), UNIVERSAL("HATCHBACK"),
	CABRIO("CABRIO"), SUV("SUV"), ROADSTER("ROADSTER"), COUPE("COUPE");
	private BodyType(String title) {
		this.title = title;
	}

	private String title;

	public String getTitle() {
		return title;
	}

}
