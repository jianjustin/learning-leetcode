public class Solution {

    public int removeDuplicates(int[] nums) {
        if(null == nums || nums.length == 0)return 0;
        int key = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[key] != nums[i])nums[++key] = nums[i];
        return key+1;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));
    }

}
