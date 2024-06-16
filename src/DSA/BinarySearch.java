package DSA;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Key was not found in the array
        return -1;
    }

    // Utility function to print the array
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;

        System.out.println("Array:");
        printArray(arr);

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
