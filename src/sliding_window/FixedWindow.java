package sliding_window;

public class FixedWindow {
    public static int findLargestSum(int[] nums, int k) {
        int windowSum = 0;
        int largest;

        // Build the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        largest = windowSum;

        // Slide the window
        for (int right = k; right < nums.length; right++) {
            int left = right - k;
            System.out.println(left);
            windowSum -= nums[left];    // remove leftmost
            windowSum += nums[right];   // add new rightmost

            largest = Math.max(largest, windowSum);
        }

        return largest;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1, 2, 3, 7, 4, 1}; // 14
        int largest = findLargestSum(nums, k);
        System.out.println("Largest: " + largest);
    }
}
