interface Method1{
    public void method1();
}

interface Method2{
    public void method2();
}

abstract class Method3{
    abstract public void method3();
    public void Method4(){
        System.out.println("Method 4 execute...");
    }
}

class Main1 extends Method3 implements Method1, Method2{
    @Override
    public void method1() {
        System.out.println("Method 1 execute...");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 execute...");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 execute...");
    }
}

public class Java_Inheritance_Multiple {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.method1();
        main1.method2();
        main1.method3();
        main1.Method4();
    }
}
