public class Garbage_Collector {
    protected void finalize() throws Throwable{
        System.out.println("Finalize method is called");
    }
    public static void main(String[] args) {
        Garbage_Collector GC = new Garbage_Collector();
        GC = null;
        System.gc();
    }
}
