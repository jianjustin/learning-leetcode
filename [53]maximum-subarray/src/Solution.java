public class Solution {

    public int maxSubArray(int[] nums) {
        int ans = nums[0] , sum = 0;
        for(int num: nums) {
            sum = sum > 0 ? sum + num :  num;
            ans = ans < sum ? sum : ans;
        }
        return ans;
    }

}
