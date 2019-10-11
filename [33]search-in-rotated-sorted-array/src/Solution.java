public class Solution {
    public int search(int[] nums, int target) {
        if (null == nums || nums.length == 0)return -1;
        int begin = 0 , begin1 = nums.length;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] < nums[i-1]){
                begin1 = i;
                break;
            }

        if (nums[0] <= target) {
            for (int i = 0; i < begin1; i++)
                if (nums[i] == target) return i;
        }else {
            for (int j = begin1; j < nums.length; j++)
                if (nums[j] == target) return j;
        }
        return -1;
    }
}
