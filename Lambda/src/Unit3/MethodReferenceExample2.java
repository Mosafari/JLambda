package Unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

         // with method reference
         printConditionally(people, p -> true, System.out::println);// == p -> method(p)

      }

   private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {// use predicade instead of Condition interface, 
      // so in such cases you can use this approach rather than creating new interface.
      for(Person p: people){
            if (predicate.test(p)){
               consumer.accept(p);;
            }
      }
   }
}