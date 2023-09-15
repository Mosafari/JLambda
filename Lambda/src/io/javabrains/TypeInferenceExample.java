package io.javabrains;

public class TypeInferenceExample{
    public static void main(String[] args) {
        // StringLengthLambda myLambda = (String s) -> s.length();// you can also delete String because the getLengh knows the param is String
        // System.out.println(myLambda.getLength("Hello Lambda"));
        printLambda( s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda")); //prints the lambda expression  result!
    }
    interface StringLengthLambda{
        int getLength(String s);
    }
}