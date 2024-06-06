package DSA;

import java.util.Scanner;

public class Array_Addition {
    public static int Add_Arr(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements.");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Array Elements.");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int result = Add_Arr(arr);
        System.out.println("The sum of array is: "+result);
    }
}
