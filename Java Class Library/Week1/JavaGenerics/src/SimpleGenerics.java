
public class SimpleGenerics {
    private interface Stack<E>{
        void push(E element);
        E pop();
    }
    private static class StackArray<E> implements Stack<E>{
        int tos;
        E[] stacks;

        public StackArray(){
            this(10);
        }
        @SuppressWarnings("unchecked")
        public StackArray(int maxdepth){
            tos = 0;
            E[] stacks = (E[]) new Object[maxdepth]; 
        }
        @Override
        public void push(E element){
            stacks[tos++] = element;
        }

        @Override
        public E pop(){
            return tos > 0 ? stacks[--tos] : null;
        }

    }
    public static void main(String[] args) throws Exception {
        Stack<Integer> ints = new StackArray<>();
        Stack<String> strings = new StackArray<>(5);

        if( strings.getClass() == ints.getClass()){
            System.out.printf("Stack<Integer> and Stack<String are both %s!", strings.getClass());
        }

        ints.push(5);
        ints.push(8);
        // ints.push("s");

        strings.push("sdg");
        strings.push("rge");
        strings.push("sdgreg");
        strings.push("erg");
        // strings.push(5);
    }
}
