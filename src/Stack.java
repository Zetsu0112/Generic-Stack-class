
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

}