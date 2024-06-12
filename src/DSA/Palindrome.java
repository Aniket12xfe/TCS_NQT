package DSA;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String.");
        String str = sc.next();
        String rev = new StringBuilder(str).reverse().toString();
        if (!str.equals(rev)){
            System.out.println("string is not Palindrome");
        }
        else {
            System.out.println("String is Palindrome");
        }
    }
}
