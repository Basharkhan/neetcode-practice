package binary_search;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high -low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 2;
        int index = binarySearch(arr, x);

        if (index == -1) {
            System.out.println("Number is not found");
        } else {
            System.out.println("Index of Number: " + index);
        }
    }
}
