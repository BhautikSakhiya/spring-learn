package com.meaven.learn;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;
//
//	
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Its working";
//		return "Tyre [brand=" + brand + "]";
	}
	
	
}
