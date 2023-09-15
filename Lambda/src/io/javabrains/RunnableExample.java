package io.javabrains;

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Print inside Runnable");
            }
        });
        t.run();
        Thread mythread = new Thread(() -> System.out.println("Print inside lambda Runnable"));
        // we can use lambda because Runnable Interface has only one abstract method.
        mythread.run();

    }
}
