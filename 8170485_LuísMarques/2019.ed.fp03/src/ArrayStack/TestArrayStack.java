package ArrayStack;

import Default.EmptyCollectionException;

/**
 * <h3>
 * <strong>DEMO class to test the classes implemented in the project</strong>
 * </h3>
 */
public class TestArrayStack {
    public static void main(String[] args) {

        ArrayStack<String> arrayStack = new ArrayStack<String>(3);

        int test = 5;

        switch (test) {
            case 1:
                arrayStack.push("Ola");
                arrayStack.push("Mundo");
                System.out.println(arrayStack.toString() + "\n Top: " + arrayStack.size());
                break;
            case 2:
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                break;
            case 3:
                arrayStack.push("I'LL BE BACK!");
                System.out.println(arrayStack.toString() + "\n Top: " + arrayStack.size());
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                System.out.println("\n\n*You tried to remove an element!*\n\n");
                System.out.println(arrayStack.toString() + "\n Top: " + arrayStack.size());
                break;
            case 4:
                arrayStack.push("H");
                arrayStack.push("E");
                arrayStack.push("L");
                arrayStack.push("L");
                arrayStack.push("O");
                System.out.println(arrayStack.toString() + "\n Top: " + arrayStack.size());
                break;
            case 5:
                arrayStack.push("H");
                arrayStack.push("E");
                arrayStack.push("L");
                arrayStack.push("L");
                arrayStack.push("O");
                System.out.println(arrayStack.toString() + "\n Top: " + arrayStack.size());
                System.out.println("\n\nREMOVING 5 ELEMENTS...\n\n");
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                try {
                    arrayStack.pop();
                } catch (EmptyCollectionException e) {
                    System.err.println("ERROR! You cannot remove elements from an empty stack!");
                }
                System.out.println(arrayStack.toString() + "\n Top: " + arrayStack.size());
                break;
        }
    }
}
