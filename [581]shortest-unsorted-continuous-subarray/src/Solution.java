import java.util.Arrays;

public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int[] nums1 = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            nums1[i] = nums[i];

        Arrays.sort(nums1);

        int begin = -1 , end = -1;
        for (int i = 0; i < nums.length; i++)
            if (nums1[i] != nums[i])
                if (begin == -1)
                    begin = i;
                else
                    end = i;

        if (begin == end)return 0;
        return end - begin + 1;

    }

}
