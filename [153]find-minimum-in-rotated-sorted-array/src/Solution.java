public class Solution {

    public int findMin(int[] nums) {
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                result = nums[i];
                break;
            }
        }

        return result;

    }

}
