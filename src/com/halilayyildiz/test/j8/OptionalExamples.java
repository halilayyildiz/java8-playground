package com.halilayyildiz.test.j8;

import java.util.Optional;

import com.halilayyildiz.test.Car;
import com.halilayyildiz.test.Person;

public class OptionalExamples {

	public static void main(String[] args) {
		
		Person person = new Person("Halil", 30);
		Optional<Person> optPerson = Optional.empty();
		
		System.out.println("1 --------------------------");
		Optional<Person> optPerson1 = Optional.empty(); 
		System.out.println(optPerson1);
		
		
		System.out.println("2 --------------------------");
		Optional<Person> optPerson2 = Optional.empty(); 
		optPerson2.ifPresent(System.out::println);
		
		
		System.out.println("3 --------------------------");
		Optional<Person> optPerson3 = Optional.ofNullable(person);
		System.out.println(optPerson3);
		optPerson3 = Optional.ofNullable(null);
		System.out.println(optPerson3);
		
		
		System.out.println("4 --------------------------");
		Optional<Person> optPerson4 = Optional.of(person); 
		System.out.println(optPerson4);
		System.out.println(optPerson4.isPresent());
		System.out.println(optPerson4.get());
		
		
		System.out.println("5 --------------------------");
		Person person51 = optPerson.orElse(new Person("Ali", 21));
		System.out.println(person51);
		Person person52 = optPerson.orElse(null);
		System.out.println(person52);
//		Person person53 = optPerson.orElseThrow(IllegalStateException::new);
		
		
		System.out.println("6 --------------------------");
		Optional<Person> optPerson6 = Optional.of(person); 
		optPerson6.filter(p -> p.getAge() > 25).ifPresent(System.out::println);
		Optional<Person> optPerson61 = optPerson6.filter(p -> p.getAge() < 25);
		System.out.println(optPerson61);
		
		
		System.out.println("7 --------------------------");
		Optional<Person> optPerson71 = Optional.of(person);
		optPerson71.map(Person::getName).filter(name -> name.startsWith("H")).ifPresent(name -> System.out.println("Person name starts with 'H' char !"));
		Optional<Person> optPerson72 = Optional.of(new Person("Ali", 20));
		optPerson72.map(Person::getName).filter(name -> name.startsWith("H")).ifPresent(name -> System.out.println("Person name starts with 'H' char !"));
		
		
		System.out.println("8 --------------------------");
		Optional<Person> optPerson8 = Optional.of(person);
		String carName1 = optPerson8.flatMap(Person::getCar).map(Car::getModelName).orElse("UNKNOWN");
		System.out.println(carName1);
		person.setCar(Optional.of(new Car("Opel", "Astra", 2012)));
		String carName2 = optPerson8.flatMap(Person::getCar).map(c -> c.toString()).orElse("UNKNOWN");
		System.out.println(carName2);
		String carName3 = optPerson8.map(Person::getCar).map(c -> c.toString()).orElse("UNKNOWN");
		System.out.println(carName3);
		
		
	}
	
}
