package DSA;

import java.util.Scanner;

public class StrLen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scanner.next();
        int length = 0;
        for (char c : str.toCharArray()){
            length++;
        }
        System.out.println("Length of String without length function is: "+length);
    }
}
