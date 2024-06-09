package DSA;

public class Stack {
    public int maxSize;
    public int[] stackArray;
    public int top;

    Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if (top == maxSize-1){
            System.out.println("Stack is full. Cannot Push. "+value);
        }
        else {
            stackArray[++top] = value;
            System.out.println("Pushed "+value+" to the stack.");
        }
    }

    public void pop(){
        if (top == -1){
            System.out.println("Stack is empty. Cannot pop.");
        }
        else {
            int value = stackArray[top--];
            System.out.println("Popped "+value+" to the stack.");
        }
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        else {
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("The top element in stack is "+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); //trying to pop empty stack
    }
}
