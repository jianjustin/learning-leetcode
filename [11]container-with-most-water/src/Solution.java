public class Solution {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int h = Math.abs(i-j);
                int w = Math.min(height[i],height[j]);
                if(w*h>max)max = w*h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(heights));
    }
}
