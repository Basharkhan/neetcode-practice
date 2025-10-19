package sliding_window;

public class MaximumSum {
    public static int maxSum(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            int left = right - k;
            windowSum -= nums[left];
            windowSum += nums[right];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 0, 3}; // 7
        int k = 3;
        int maxSum = maxSum(arr, k);
        System.out.println("Max sum: " + maxSum);
    }
}
