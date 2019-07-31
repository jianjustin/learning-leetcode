public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        for (int j = 0; j < k; j++)
            max += nums[j];

        double value = max;
        for (int i = k; i < nums.length; i++) {
            value = value + nums[i] - nums[i-k];
            if (max < value)max = value;

        }

        return max/k;
    }

}
