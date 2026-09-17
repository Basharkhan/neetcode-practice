package products_of_array_except_self;

import java.util.*;

public class Solution3 {
    public static int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                left *= nums[i - 1];
            }
            products[i] = left;
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (j != nums.length - 1) {
                right *= nums[j + 1];
            }
            products[j] *= right;
        }

        return products;
    }

    public static void main(String[] args) {
        // int[] nums = {2, 3, 4, 5}; // 60, 40, 30, 24 left 1 2 6 24 right 60 20 5 1
        // int[] nums = {1, 2, 3, 4}; // 24,12,8,6 left 1 1 2 6
        int[] nums = {-1,1,0,-3,3}; // 0,0,9,0,0
        int[] ints = productExceptSelf(nums);
        System.out.println("Products: " + Arrays.toString(ints));
    }
}
