package products_of_array_except_self;

import java.util.Arrays;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
           int prod = 1;
           for (int j = 0; j < nums.length; j++) {
               if (i != j) {
                   prod *= nums[j];
               }
               products[i] = prod;
           }
        }
        return products;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6};
        int[] products = productExceptSelf(nums);
        System.out.println(Arrays.toString(products));
    }
}
