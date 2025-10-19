package sliding_window.practice_easy;

public class MaximumSum {
    public static int findMax(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int max = windowSum;

        int left = 0;
        for (int right = k; right < arr.length; right++) {
            windowSum += arr[right];
            windowSum -= arr[left];
            left++;

            max = Math.max(max, windowSum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        int max = findMax(arr, k);
        System.out.println("Max: " + max);
    }
}
