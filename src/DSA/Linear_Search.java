package DSA;

public class Linear_Search {
    public static int LSearch(int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 9, 0};
        int k = 9;
        int result = LSearch(arr, k);
        System.out.println("Key at index: "+result);
    }
}
