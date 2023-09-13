package io.javabrains.Unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

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
        // people.forEach(System.out::println);
        
		
		// Step 2: Create a method that prints all elements in the list
        // System.out.println("Printing all persons");
        // Java 7
        // printall(people);
		//Java 8 my solution:
        // people.forEach((p) -> System.out.println(p));
        // Java 8 tutorial Solution:
        // printConditionally(people, p -> true);

		// Step 3: Create a method that prints all people that have last name beginning with C 
        //Java 7
        System.out.println("Printing all persons with last name beginning with C");
		// printConditionally(people, new Condition() {
		// 	@Override
		// 	public boolean test(Person p) {
		// 		return p.getLastName().startsWith("C");
		// 	}
		// });
        // Java 8
        printConditionally(people, p -> p.getLastName().startsWith("C"));

	}

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {// use predicade instead of Condition interface, 
        // so in such cases you can use this approach rather than creating new interface.
        for(Person p: people){
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }

    private static void printall(List<Person> people) {
        for(Person p : people){
            System.out.println(p);
        }
    }

}
// interface Condition {
// 	boolean test(Person p);
// }