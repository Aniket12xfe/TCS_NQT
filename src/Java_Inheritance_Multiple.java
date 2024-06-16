interface Method1{
    public void method1();
}

interface Method2{
    public void method2();
}

class Main1 implements Method1, Method2{
    @Override
    public void method1() {
        System.out.println("Method 1 execute...");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 execute...");
    }
}

public class Java_Inheritance_Multiple {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.method1();
        main1.method2();
    }
}
