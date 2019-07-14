public class Solution {

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int result = Integer.MAX_VALUE;
        while(right < nums.length){
            while(sum < s && right != nums.length)
                sum += nums[right++];
            while(sum >= s){
                if(result > right-left) result = right-left;
                sum -= nums[left++];//够了，左指针走
            }
        }
        return result == Integer.MAX_VALUE?0:result;
    }
}
