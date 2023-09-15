package Week1;

import java.util.Deque;
import java.util.LinkedList;

public class DequeStack<E> implements Stack<E>{
    private static Deque stack;

    public DequeStack(){
        stack = new LinkedList<E>();
    }

    @Override
    public void push(E element) {
        stack.push(element);
    }

    @Override
    public E pop() {
        return (E) stack.pop();
    }
    
}
