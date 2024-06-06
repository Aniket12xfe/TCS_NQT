class MathUtils{
    public static int add(int a, int b){
        return a + b;
    }

    public static int multiplier = 2;


    public static int multiply(int a){
        return a * multiplier;
    }
}

public class Use_Static_Methods {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 10);
        int multiply = MathUtils.multiply(5);
        System.out.println("Sum is: "+sum);
        System.out.println("Multiplication is: "+multiply);
    }
}
