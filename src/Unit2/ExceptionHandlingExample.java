package Unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] num = {3,5,4,8,9,6};
        int key = 2;
        // now what if key =0?
        // key =0; //simple way -> using try catch

        // proccess(num, key) ;
        proccess(num, key, wrapperLambda((i, k) -> System.out.println(i / k))) ;
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (k,v) -> {
            try{
                System.out.println("in wrapper lambda");
                consumer.accept(k, v);
            }catch(ArithmeticException e){
                System.out.println("Exception cought in wrapperlambda");
            }
        };
    }

    private static void proccess(int[] num, int key, BiConsumer<Integer, Integer> consumer) {
        for(int i : num){
            // System.out.println(i + key);
            // try{
                consumer.accept(i, key);
            // }catch(ArithmeticException e){
                // or you can write try/catch in lambda (but this way it's not clean ) ,better way, using wrapperlambda
            // }
        }
    }
    
}
