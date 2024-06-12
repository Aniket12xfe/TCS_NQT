package DSA;

import java.util.Scanner;

public class SecondLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = str.length();
        if (str.length() >= 2){
            char secondLast = str.charAt(str.length() - 2);
            System.out.println("The Second last element in String is: "+secondLast);
        }
        else {
            System.out.println("String is too Short.");
        }
        System.out.println("The count of elements in string: "+count);
    }
}
