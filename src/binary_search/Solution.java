package binary_search;

public class Solution {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = Integer.MAX_VALUE;

        if (nums[l] < nums[r]) {
            return nums[l];
        }

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] < min) {
                min = nums[mid];
            }

            if (nums[l] > nums[r] && nums[mid] >= nums[l]) {
                l = mid + 1;
            } else if (nums[l] < nums[r] && nums[mid] >= nums[l]) {
                r = mid - 1;
            } else {
                l++;
                r--;
            }
        }

        return min;
    }

    public static void main (String[] args) {
       // int[] nums = {3,4,5,6,7,8,1,2};
//        int[] nums = {3,4,5,6,1,2};
//        int[] nums = {4,5,0,1,2,3};
//        int[] nums = {4,5,6,7};
        int[] nums = {1};
//        int[] nums = {1,2};
        //int[] nums={4,5,6,7,0,1,2};

        int min = findMin(nums);
        System.out.println(min);
    }
}
