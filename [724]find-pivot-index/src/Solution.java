public class Solution {

    public int pivotIndex(int[] nums) {
        double sum = 0 , sum1 = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        for (int i = 0; i < nums.length; i++) {
            double value = (sum - nums[i])/2;
            if (sum1 == value)return i;
            sum1 += nums[i];
        }
        return -1;
    }

}
