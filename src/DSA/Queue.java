package DSA;

public class Queue {
    public int maxSize;
    public int[] queueArray;
    public int front;
    public int rare;
    public int item;

    public Queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rare = -1;
        item = 0;
    }
    public boolean isFull(){
        return item == maxSize;
    }

    public boolean isEmpty(){
        return item == 0;
    }
    public void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is Full. "+value);
        }
        else {
            if(rare == maxSize-1){
                rare = -1;
            }
            queueArray[++rare] = value;
            item++;
            System.out.println("enqueue the element "+value+" to the queue.");
        }
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty. Can't remove elements.");
        }
        else {
            int value = queueArray[front++];
            if (front == maxSize){
                front = 0;
            }
            item--;
            System.out.println("dequeue the element "+value+" to the queue.");
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        else {
            return queueArray[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
