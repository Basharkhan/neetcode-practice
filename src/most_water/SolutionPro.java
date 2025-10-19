package most_water;

// Container With Most Water
public class SolutionPro {
    public static int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;

        while (l <= r) {
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxArea = Math.max(area, maxArea);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        int area = maxArea(heights);
        System.out.println("Area: " + area);
    }
}
// height=[1,7,2,5,12,3,500,500,7,8,4,7,3,6]
// 500
// Customize Toolbar…