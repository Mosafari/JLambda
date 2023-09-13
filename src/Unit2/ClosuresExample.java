package Unit2;

public class ClosuresExample {
    public static void main(String[] args) {
        int o = 10;
        int b =20;
        // doProces(o, new Process() {

        //     @Override
        //     public void proces(int i) {

        //         System.out.println(o + b);
        //     }
            
        // });
        doProces(o, i -> System.out.println(i + b));
    }
    public static void doProces(int i, Process p){
        p.proces(i);
    }
}

interface Process{
    void proces(int i);
}
/*ChatGPT:
 *  Closures are a programming concept where a function can capture and remember the environment 
 * (variables and data) in which it was created, even if it is called outside that environment. 
 * In Java, prior to Java 8, closures were not directly supported. However, Java 8 introduced lambda 
 * expressions, which can be considered a form of closures.

 *  Lambda expressions in Java allow you to define a block of code (a function) that can be passed around 
 *  as an argument to other functions, stored in data structures, and executed later. Lambda expressions can 
 *  capture variables from their surrounding context, effectively creating closures. These variables must be 
 *  effectively final or final, meaning they cannot be modified after capture.
 */