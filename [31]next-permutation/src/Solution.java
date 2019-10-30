import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (null == nums || nums.length == 0)return;
        int i = nums.length-1, j = 0;
        while (i > 0 && nums[i] < nums[i-1])i--;
        if (0 == i){
            Arrays.sort(nums);//说明到达最后一个排列组合
            return;
        }
        j = i;
        while (j < nums.length-1 && nums[i-1] < nums[j+1])j++;
        int temp = nums[i-1];
        nums[i-1] = nums[j];
        nums[j] = temp;
        int n = j-i+1;
        for (int k = i; k < i+n/2; k++) {
            temp = nums[k];
            nums[k] = nums[n-k+1];
            nums[n-k+1] = temp;
        }
    }
}
