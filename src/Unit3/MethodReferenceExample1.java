package Unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        // inner class
        // Thread t1 = new Thread(new Runnable() {
        //     @Override
        //     public void run(){
        //         printMessage();
        //     }
        // });
        //lambda 
        // Thread t = new Thread(() -> printMessage());
        // method reference
        Thread t = new Thread(MethodReferenceExample1::printMessage);
        t.start();

    }

    public static void printMessage() {
        System.out.println("Hello");
    }
    
    
}
/*ChatGPT:
 * No, the method referenced in a method reference in Java does not have to be static. Method references can refer to both static and instance methods, depending on the context.

There are four types of method references in Java:

1. **Reference to a Static Method:** In this case, you reference a static method of a class. The syntax is `ClassName::staticMethodName`.

   ```java
   // Example of referencing a static method
   Function<Integer, Double> converter = Integer::doubleValue;
   ```

2. **Reference to an Instance Method of a Particular Object:** You can reference an instance method of a specific object. The syntax is `objectReference::instanceMethodName`.

   ```java
   // Example of referencing an instance method of a specific object
   String str = "Hello, World!";
   Supplier<Integer> lengthSupplier = str::length;
   ```

3. **Reference to an Instance Method of an Arbitrary Object of a Particular Type:** This is useful when you're working with methods that don't take any arguments. The syntax is `ClassName::instanceMethodName`.

   ```java
   // Example of referencing an instance method of a specific type
   List<String> list = Arrays.asList("apple", "banana", "cherry");
   list.forEach(System.out::println);
   ```

4. **Reference to a Constructor:** You can reference a constructor using the `new` keyword. The syntax is `ClassName::new`.

   ```java
   // Example of referencing a constructor
   Supplier<List<String>> listSupplier = ArrayList::new;
   ```

As you can see from these examples, method references can be used for both static and instance methods, and even for constructors. The choice of which type of method reference to use depends on the method's signature and the context in which it's being used.
 */
