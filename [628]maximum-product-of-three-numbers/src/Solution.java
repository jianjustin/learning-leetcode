import java.util.Arrays;

public class Solution {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int max = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        if(nums[0]<0 && nums[1] < 0){
            int value = nums[0]*nums[1]*nums[nums.length-1];
            if(max<value)max = value;
        }
        return max;
    }

}
