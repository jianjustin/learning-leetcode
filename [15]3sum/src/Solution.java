import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if (null == nums || nums.length < 3)return result;//前置条件
        Arrays.sort(nums);

        boolean b = false;
        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1 , k = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while (j<k && nums[j] == nums[j+1]) j++; // 去重
                    while (j<k && nums[k] == nums[k-1]) k--; // 去重
                    j++;
                    k--;
                }
                else if (sum < 0) j++;
                else if (sum > 0) k--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,0,0};
        List<List<Integer>> list = solution.threeSum(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
