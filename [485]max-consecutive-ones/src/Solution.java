public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0 , max_result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                result++;
            if(i == nums.length - 1 || nums[i] == 0){
                max_result = max_result < result ?  result : max_result;
                result = 0;
            }
        }
        return max_result;
    }

}
