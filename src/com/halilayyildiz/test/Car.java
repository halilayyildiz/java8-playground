package com.halilayyildiz.test;

public class Car {

	public String brandName;
	public String modelName;
	public int year;

	public Car(String brandName, String modelName, int year) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.year = year;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car Object - " + getBrandName() + " : " + getModelName()
				+ " : " + getYear();
	}

}
