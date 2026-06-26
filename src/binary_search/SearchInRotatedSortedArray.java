package binary_search;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(target == nums[mid]) {
                return mid;
            }

            if (nums[l] < nums[r]) {
                if (target > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (nums[l] <= nums[mid]) {
                    if (target >= nums[l] && target <= nums[mid]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    if (target >= nums[mid] && target <= nums[r]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2};
        //int[] nums={1,0};
        //int[] nums={4,5,6,7,0,1,2};
        //int[] nums={5,1,2,3,4};
        //int[] nums={4,5,6,7,0,1,2};
        //int[] nums={1,3};
        int target = 5;

        int index = search(nums, target);
        System.out.println("Index: " + index);
    }
}
