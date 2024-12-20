package kz.jgarant.dit.simpleexample1;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.print("value popped: ");
        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}


class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int maxSize) {
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long value) {
        stackArray[++top] = value;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}