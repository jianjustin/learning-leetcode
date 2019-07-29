public class Solution {

    public void moveZeroes(int[] nums) {
        int start = 0 , end = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(start >= end)break;
            if(nums[start] == 0){
                for (int j = start; j < end; j++)
                    nums[j] = nums[j+1];
                nums[end] = 0;
                end--;
            }else
                start++;
        }
    }

}
