public class Counter {
    static int count = 0;
    public Counter(){
        count++;
        System.out.println("Count is: "+count);
    }

    public static void main(String[] args) {
        Counter cu1 = new Counter();
        Counter cu2 = new Counter();
        Counter cu3 = new Counter();
        System.out.println("The total Count "+Counter.count);

    }
}
