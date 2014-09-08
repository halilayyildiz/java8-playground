package com.halilayyildiz.test.j8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.halilayyildiz.test.Person;

public class LambdaExamples {

	Runnable r1 = () -> System.out.println(this);

	public static void main(String[] args) {

		// create list
		List<Person> people = Arrays.asList(new Person("Halil",30),new Person("Ali",19),new Person("Veli",23));
		
		// sort list
		people.sort((Person p1, Person p2) -> p1.getAge() - p2.getAge());
		
		// define function
		Function<String, String> appendAAAtoInput = (name) -> {return name + "AAA";};
		
		// define function
		Function<String, String> appendBOOtoInput = new Function<String, String>() {
			
			@Override
			public String apply(String t) {
				return t + "BOO";
			}
		};
		
		
		System.out.println("1 --------------------------");
		people.stream().map(Person::getName).forEach(System.out::println);
		
		
		System.out.println("2 --------------------------");
		people.stream().map(Person::getName).filter((String name) -> name.startsWith("H")).forEach(System.out::println);
		
		
		System.out.println("3 --------------------------");
		people.stream().map(Person::getName).filter((String str) -> str.startsWith("H")).forEach((String str) -> System.out.println(str));
		
		
		System.out.println("4 --------------------------");
		people.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
		
		
		System.out.println("5 --------------------------");
		people.stream().map(Person::getName).map(appendAAAtoInput).forEach(System.out::println);
		people.stream().map(Person::getName).map(appendBOOtoInput).forEach(System.out::println);
		
		
	}
}
