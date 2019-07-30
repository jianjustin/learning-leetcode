import java.util.Arrays;

public class Solution {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = -1;

        for (int i = 0; i < nums.length; i++)
            if(i != nums[i]){
                result = i;
                break;
            }


        if(result == -1)result = nums.length;
        return result;
    }

}
