package DSA;

import java.util.Arrays;

public class Merge_Array {
    public int[] MergeArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1+n2];
        System.arraycopy(arr1, 0, result, 0, n1);
        System.arraycopy(arr2, 0, result, n1, n2);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
        Merge_Array obj = new Merge_Array();
        int[] output = obj.MergeArray(arr1, arr2);
        System.out.println("The Merge list is: "+ Arrays.toString(output));
    }
}
