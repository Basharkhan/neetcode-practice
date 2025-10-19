package most_water;

// Container With Most Water
public class Solution {
    public static int maxArea(int[] heights) {
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if (i != j) {
                    int area = Math.abs(i -j) * Math.min(heights[i], heights[j]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1,7,2,5,12,3,500,500,7,8,4,7,3,6};
        int area = maxArea(heights);
        System.out.println("Area: " + area);
    }
}
