package binary_search;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int target = 50;
        int[] sortedArr = {1, 2, 3, 10, 20, 30 , 40, 50};
        int result = binarySearch(sortedArr, target);
        System.out.println(result);
    }
}
