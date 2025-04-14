
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
}