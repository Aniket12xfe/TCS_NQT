package DSA;

import java.util.Arrays;

public class rotateArray {
    public static int[] Rotate(int[] arr, int k){
        for (int i = 0; i < k; i++){
            for (int j = arr.length-1; j > 0; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        int[] result = Rotate(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
