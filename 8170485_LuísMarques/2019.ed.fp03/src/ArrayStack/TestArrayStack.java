package ArrayStack;

import Default.EmptyCollectionException;

/**
 * <h3>
 * <strong>DEMO class to test the classes implemented in the project</strong>
 * </h3>
 */
public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();
        stack.push("Hello");
        stack.push("World");
        stack.push("I'LL BE BACK!!!!!!!!!!!");
        System.out.println(stack.toString());
        try {
            stack.pop();
        } catch (EmptyCollectionException e) {
            System.err.println("ERROR! You cannot remove elements from an empty collection");
        }
        System.out.println(stack.toString());
    }
}
