package DSA;

import java.util.Arrays;

public class Array_IMP {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[0]);         // Accessing elements

        int newElementToAdd = 5;
        int newIndex = 1;

        int newSize = arr.length + 1;
        int[] newArr = new int[newSize];

        for(int i = 0; i < newSize; i++){
            if (i < newIndex){
                newArr[i] = arr[i];
            }
            else if(i == newIndex){
                newArr[i] = newElementToAdd;
            }
            else {
                newArr[i] = arr[i-1];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
