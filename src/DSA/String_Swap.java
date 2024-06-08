package DSA;

import java.util.Arrays;

public class String_Swap {
    public static void reverseString(char[] str){
        int left = 0;
        int right = str.length-1;
        while (left < right){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'H','E','L','L','O'};
        System.out.println("Original String: "+ Arrays.toString(str));
        reverseString(str);
        System.out.println("Reverse String: "+ Arrays.toString(str));
    }
}
