package products_of_array_except_self;

import java.util.Arrays;

// submitted
public class SolutionOptimized {
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] products = new int[len];
        int[] prefixes = new int[len];
        prefixes[0] = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            int product = prefixes[i] * nums[i];
            prefixes[i + 1] = product;
        }

        int suffix = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            products[j] = prefixes[j] * suffix;
            suffix *= nums[j];
        }
        return products;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6};
        int[] products = productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(products));
    }
}
