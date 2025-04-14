
public class Stack <T> {
    private Object[] stackArray;
    private int maxSize;
    private int topIndex;

    public Stack () {
        this.maxSize = 5;
        this.stackArray = new Object[maxSize];
        topIndex = -1;
    }

    public Stack (int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        topIndex = -1;
    }

    public void push (T value) {
        if(isFull()) {
            throw new StackFullException("Stack is Full. Cannot push.");
        }
        stackArray[++topIndex] = value;
    }

    public T pop () {
        if(isEmpty()) {
            throw new StackEmptyException("Stack is Empty. Cannot peek.");
        }
        T value = (T) stackArray[topIndex];
        topIndex--;
        return value;
    }


    public T peek () {
        if(isEmpty()) {
            throw new StackEmptyException("Stack is Empty. Cannot peek.");
        }
        return (T) stackArray[topIndex];
    }

    public boolean isEmpty() {
        if(topIndex == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(topIndex == maxSize-1) {
            return true;
        }
        else {
            return false;
        }
    }

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