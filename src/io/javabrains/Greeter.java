package io.javabrains;

public class Greeter {
    public void Hello(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        greeter.Hello(helloWorldGreeter);

        
    }
    
}
