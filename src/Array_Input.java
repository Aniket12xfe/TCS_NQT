import java.util.*;

public class Array_Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
