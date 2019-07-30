public class Solution {

    public int removeDuplicates(int[] nums) {
        int result = 1 , key = 0;
        if(0 == nums.length)return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[key] != nums[i]){
                nums[++key] = nums[i];
                result++;
            }
        }
        return result;
    }

}
