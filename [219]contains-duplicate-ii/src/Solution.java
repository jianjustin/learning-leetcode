import java.util.Arrays;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && Math.abs(j-i) <= k)
                    result = true;
                if (result)break;
            }
            if (result)break;
        }

        return result;
    }

}
