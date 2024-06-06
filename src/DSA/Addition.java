package DSA;


import java.util.Scanner;

public class Addition {
    public static int Add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Add(a,b);
        System.out.println("The addition of two numbers is: "+ result);
    }
}
