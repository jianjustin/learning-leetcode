import java.util.Arrays;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]){
                result = true;
                break;
            }
        }

        return result;
    }
}
