package JGenerics;

public class GenericApp {
    public static void main(String[] args) {
        Stack<Integer> ints = new DequeStack<>();
        Stack<String> strings = new DequeStack<>();

        if( strings.getClass() == ints.getClass()){
            System.out.printf("Stack<Integer> and Stack<String are both %s!", strings.getClass());
        }
        
        ints.push(111);
        ints.push(8);
        // ints.push("s");

        strings.push("sdg");
        strings.push("rge");
        strings.push("sdgreg");
        strings.push("erg");
        // strings.push(5);
    }
    
}
