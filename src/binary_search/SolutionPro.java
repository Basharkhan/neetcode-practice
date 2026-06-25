package binary_search;

public class SolutionPro {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]) {
                return nums[l];
            }

            int mid = l + (r - l) / 2;
            min = Math.min(min, nums[mid]);

            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return min;
    }

    public static void main (String[] args) {
//        int[] nums={4,5,6,7,0,1,2};
        int[] nums={2, 1};

        int min = findMin(nums);
        System.out.println(min);
    }
}
