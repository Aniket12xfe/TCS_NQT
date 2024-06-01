class MathOperation{
    void add(int a, int b){
        int c = a + b;
        System.out.println("The sum is: "+c);
    }
    void add(int a, int b, int c){
        int d = a + b + c;
        System.out.println("The sum of Overloaded method is: "+d);
    }
}


public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
//  Method Overloading
    MathOperation mp = new MathOperation();
    mp.add(5,3);
    mp.add(4,5,6);
    }
}
