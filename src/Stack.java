/**
 * Class provides constructors and methods to create and modify a stack of any type of variable.
 * @author Philip Djurak
 * @version 11-04-2025
 */

public class Stack <T> {
    private Object[] stackArray;
    private int maxSize;
    private int topIndex;


    /**
     * Creates a new stack with a default maximum size of 5
     */
    public Stack () {
        this.maxSize = 5;
        this.stackArray = new Object[maxSize];
        topIndex = -1;
    }

    /**
     * Constructs a new stack with the specified maximum size
     * 
     * @param maxSize the maximum number of elements in the stack
     */
    public Stack (int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        topIndex = -1;
    }

    /**
     * Adds new elements to array (stack)
     * 
     * @param value of any type that gets added to array (stack)
     */
    public void push (T value) {
        if(isFull()) {
            throw new StackFullException("Stack is Full. Cannot push.");
        }
        stackArray[++topIndex] = value;
    }

    /**
     * Remove and return the top element of array (stack)
     * 
     * @return the top element of the array (stack)
     */
    public T pop () {
        if(isEmpty()) {
            throw new StackEmptyException("Stack is Empty. Cannot peek.");
        }
        T value = (T) stackArray[topIndex];
        topIndex--;
        return value;
    }

    /**
     * Looks at the top element of the array (stack)
     * 
     * @return the top element of the array (stack)
     */
    public T peek () {
        if(isEmpty()) {
            throw new StackEmptyException("Stack is Empty. Cannot peek.");
        }
        return (T) stackArray[topIndex];
    }

    /**
     * Checks if array is empty
     * 
     * @return true if array is empty, else false
     */
    public boolean isEmpty() {
        if(topIndex == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Checks if array is full
     * 
     * @return true if array is full, else false
     */
    public boolean isFull() {
        if(topIndex == maxSize-1) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Concatenate all elements of a stack and return it as a list
     * 
     * @return the list of elements from array
     */
    public String list () {
        String list = "";
        
        for(int i = topIndex; i >= 0; i--) {
            list += stackArray[i];
            if(i != 0) {
                list += ";";
            }
        }
        return list;
    }
}