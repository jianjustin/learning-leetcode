import java.util.Arrays;

public class Solution {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0)return 0;
        int key = 1;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[key-1])nums[key++] = nums[i];
        return key >= 3 ? nums[key-3] : nums[key-1];
    }
}
