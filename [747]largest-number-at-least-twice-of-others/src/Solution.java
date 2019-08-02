public class Solution {

    public int dominantIndex(int[] nums) {
        int max = 0 , max1 = 0 , max_key = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max1 = max;
                max = nums[i];
                max_key = i;
            }else if(nums[i]>max1){
                max1 = nums[i];
            }
        }

        if(max1*2 > max)return -1;
        return max_key;
    }
}
