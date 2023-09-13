package io.javabrains.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.common.Person;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
        //java 7
        // Collections.sort(people, new Comparator<Person>() {
        //     @Override
        //     public int compare(Person p1, Person p2){
        //         return p1.getLastName().compareTo(p2.getLastName());
        //     }
        // });
        // people.forEach(System.out::println);
        //java 8
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        people.forEach(System.out::println);
        
		
		// Step 2: Create a method that prints all elements in the list
		
		// Step 3: Create a method that prints all people that have last name beginning with C 

	}

}