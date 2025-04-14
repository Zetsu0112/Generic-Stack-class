/**
 * Creates stacks and test them with methods from "Stack" class
 * @author Philip Djurak
 * @version 13-04-2025
 */

public class Main {
    public static void main(String[] args) {

        // Create stacks (1. Integer stack, 2. String stack)
        Stack<Integer> numberStack = new Stack<>(6);
        Stack<String> textStack = new Stack<>(2);

        try {

            // Add elements to stacks
            numberStack.push(3);
            numberStack.push(1);
            numberStack.push(6);
            numberStack.push(4);

            textStack.push("Dog");
            textStack.push("Cat");

            // Modify stacks
            System.out.println(numberStack.pop());
            System.out.println(numberStack.peek());

            System.out.println(textStack.pop());
            System.out.println(textStack.peek());

            System.out.println(numberStack.list());
            System.out.println(textStack.list());

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
