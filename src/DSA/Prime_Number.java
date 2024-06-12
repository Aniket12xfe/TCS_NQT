package DSA;

import java.util.Scanner;

public class Prime_Number {
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check is Prime.");
        int num = sc.nextInt();
        if (isPrime(num)){
            System.out.println(num + " is prime number.");
        }
        else {
            System.out.println(num + " is not prime number.");
        }
    }
}
