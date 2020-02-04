package Default;

import ArrayStack.ArrayStack;
import LinkedStack.LinkedStack;

import java.util.concurrent.TimeUnit;

/**
 * <h3>
 * <strong>DEMO class to test the classes implemented in the project</strong>
 * </h3>
 *
 * @author Luis Marques
 */
public class DEMO {
    public static void main(String[] args) {

        StackADT<String> stack = new LinkedStack<String>();

        int test = 4;

        switch (test) {
            case 1:
                stack.push("Ola");
                stack.push("Mundo");
                System.out.print(stack.toString() + "\n\nSize: " + stack.size());
                try {
                    System.out.print("\n\nTop: " + stack.peek());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                break;
            case 3:
                stack.push("I'LL BE BACK!");
                System.out.println(stack.toString() + "\n\nSize: " + stack.size());
                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                System.out.println("\n\n*You tried to remove an element!*\n\n");
                System.out.println(stack.toString() + "\n\nSize: " + stack.size());
                try {
                    System.out.print("\n\nTop: " + stack.peek());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                break;
            case 4:
                stack.push("H");
                stack.push("E");
                stack.push("L");
                stack.push("L");
                stack.push("O");
                System.out.println(stack.toString() + "\n\nSize: " + stack.size());
                try {
                    System.out.print("\n\nTop: " + stack.peek());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                break;
            case 5:
                stack.push("H");
                stack.push("E");
                stack.push("L");
                stack.push("L");
                stack.push("O");
                System.out.println(stack.toString() + "\n\nSize: " + stack.size());
                try {
                    System.out.print("\n\nTop: " + stack.peek());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                System.out.println("\n\nREMOVING 5 ELEMENTS...\n\n");

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }

                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    stack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                System.out.println(stack.toString() + "\n\nSize: " + stack.size());
                try {
                    System.out.print("\n\nTop: " + stack.peek());
                } catch (EmptyCollectionException e) {
                    System.err.println(e.getMessage());
                }
                break;
        }
    }
}