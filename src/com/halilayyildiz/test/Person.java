package com.halilayyildiz.test;

import java.util.Optional;

public class Person {

	public String name;
	public int age;
	public Optional<Car> car = Optional.empty();

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person Object - " + getName() + " : " + getAge() + car.map(c -> " : " + c.toString()).orElse("");
	}

}
