public class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        MyThreadRunnable runnable = new MyThreadRunnable();
        runnable.run();
    }
}
