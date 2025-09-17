package products_of_array_except_self;

import java.util.Arrays;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] products = {};
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                System.out.println(product);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        int[] products = productExceptSelf(nums);
        // System.out.println(Arrays.toString(products));
    }
}
