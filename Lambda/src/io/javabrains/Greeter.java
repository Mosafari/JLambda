package io.javabrains;

public class Greeter {
    public void Hello(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        // greeter.Hello(helloWorldGreeter);

        // implement interface with lambda , to asign lambda to a var
        // MyLambda myLambdaFunction = (int a)-> System.out.println("Hello World! "); this doesnt work(dosen't have a same signature with interface)
        // MyLambda myLambdaFunction = ()-> System.out.println("Hello World! ");

        // in our case we use Greeting Interface, so :
        Greeting myLambdaFunction = ()-> System.out.println("Hello World! ");
        // myLambdaFunction.perform();

        //we can also use innerClass
        Greeting innerClassGreeting = new Greeting() {
            public void perform(){
            System.out.println("Hello World! ");
            } 
        };
        innerClassGreeting.perform();
        // or
        greeter.Hello(innerClassGreeting);
        greeter.Hello(()-> System.out.println("Hello World! ")); //this automaticly consider lambda as a Greeting instance , because param type of HEllo is Greeying
        greeter.Hello(myLambdaFunction); // using lambda

        
    }
    
}

//  interface MyLambda{
//     // should have same signature with lambdafunc
//     // and we only should 1 method (to implements it as lambda)
//     void foo();

// }