class MyThreadOne extends Thread{
    private final String  threadName;
    MyThreadOne(String name){
        threadName = name;
    }

    public void run(){
        for (int i = 0; i <= 5; i++){
            System.out.println(threadName+" - count: "+ i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(threadName+" Interrupted.");
            }
        }
        System.out.println(threadName+" Thread exiting");
    }
}

public class TestMultiThreading {
    public static void main(String[] args) {
        MyThreadOne threadOne = new MyThreadOne("Thread 1");
        MyThreadOne threadOne1 = new MyThreadOne("Thread 2");

        threadOne.start();
        threadOne1.start();
    }
}
