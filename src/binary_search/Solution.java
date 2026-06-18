package binary_search;

public class Solution {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        if (nums[l] < nums[r]) {
            return nums[l];
        }

        while (l <= r) {

            int mid = (l + r) / 2;

            // if (nums[mid])
        }

        return 0;
    }

    public static void main(String[] args) {
        //int[] nums = {3,4,5,6,1,2};
        // int[] nums = {4,5,0,1,2,3};
        int[] nums = {4,5,6,7};
        //int[] nums = {9, 10, 1, 2, 3, 4, 6, 7, 8};

        int min = findMin(nums);
        System.out.println(min);
    }
}
