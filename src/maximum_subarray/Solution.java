package maximum_subarray;

public class Solution {
    public static int maxSubArray(int[] nums) {
        int largestSum = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return largestSum;
    }

    public static void main(String[] args) {
        int[] nums = {2,-3,4,-2,2,1,-1,4};
        int largestSum = maxSubArray(nums);
        System.out.println("Largest sum: " + largestSum);
    }
}
