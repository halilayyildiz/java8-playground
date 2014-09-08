package com.halilayyildiz.test.j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.halilayyildiz.test.Person;

public class StreamExamples {

	Runnable r1 = () -> System.out.println(this);

	public static void main(String[] args) {

		// create list
		List<Person> people = Arrays.asList(new Person("Halil",30),new Person("Ali",19),new Person("Veli",23));
		
		// sort list
		people.sort((Person p1, Person p2) -> p1.getAge() - p2.getAge());
		
		
		System.out.println("1 --------------------------");
		String names = people.stream().map(Person::getName).collect(Collectors.joining(", "));
		System.out.println(names);
		
		
		System.out.println("2 --------------------------");
		String namesWithOlderThan20 = people.stream().filter(p -> p.getAge() > 20).map(Person::getName).collect(Collectors.joining(","));
		System.out.println(namesWithOlderThan20);
		
		
		System.out.println("3 --------------------------");
		int maxAge = people.stream().mapToInt(Person::getAge).min().getAsInt();
		System.out.println(maxAge);
		
		
		System.out.println("4 --------------------------");
		int sumAge = people.stream().mapToInt(Person::getAge).sum();
		System.out.println(sumAge);
		
		
		System.out.println("5 --------------------------");
		int sumAge2 = people.stream().map(Person::getAge).reduce((a ,b) -> b - a).get();
		System.out.println(sumAge2);
		
		
		System.out.println("9 --------------------------");
		String ints1to10 = Stream.iterate(1, i -> i+1).limit(10).map(i -> i.toString()).collect(Collectors.joining(", "));
		System.out.println(ints1to10);
		
		
	}
}
