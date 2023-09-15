package Unit3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

import io.javabrains.common.Person;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Ana", "Din", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		// Sort
		List<Person> sortedlist = people.stream()
		.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getFirstName))
		.collect(Collectors.toList());

		sortedlist.forEach(System.out::println);

		// Filter
		List<Person> filteredlist = people.stream()
		.filter(p -> p.getAge() > 42)
		.collect(Collectors.toList());

		filteredlist.forEach(person -> System.out.println(person));

		// Count
		List<Integer> num = Arrays.asList(1,1,2,6,5,4,4,8,9,8,8,2,5,6,3,4);
		Set<Integer> setnum = Set.copyOf(num);
		// for(int i: setnum){
		// 	System.out.println("Number of "+ i + " : "+num.stream()
		// 	.filter(p -> p == i)
		// 	.count());			
		// }
		// or
		setnum.forEach(i -> {
			System.out.println("Number of "+ i + " : "+num.stream()
			.filter(p -> p == i)
			.count());
		});
		// to store in map

		Map<Integer,Long> numofiter = num.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(numofiter);
		

		// All match
    boolean allMatch = people.stream()
        .allMatch(person -> person.getAge() > 8);

   System.out.println(allMatch);
    // Any match
    boolean anyMatch = people.stream()
        .anyMatch(person -> person.getAge() > 121);

   System.out.println(anyMatch);
    // None match
    boolean noneMatch = people.stream()
        .noneMatch(person -> person.getFirstName().equals("Antonio"));

   System.out.println(noneMatch);

    // Max
    people.stream()
        .max(Comparator.comparing(Person::getAge))
       .ifPresent(System.out::println);

    // Min
    people.stream()
        .min(Comparator.comparing(Person::getAge))
       .ifPresent(System.out::println);

    // Group
    Map<Integer, List<Person>> groupByAge = people.stream()
        .collect(Collectors.groupingBy(Person::getAge));

   groupByAge.forEach((age, people1) -> {
     System.out.println(age);
     people1.forEach(System.out::println);
     System.out.println();
   });


		
		
    }
    
}
