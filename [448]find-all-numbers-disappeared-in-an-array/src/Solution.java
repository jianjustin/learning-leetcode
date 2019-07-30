import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<Integer>();

        int m = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == m)m++;
            if(nums[i] > m){
                result.add(m++);
                i--;
            }
        }

        for (int i = m; i <= nums.length; i++)
            result.add(i);


        return result;
    }

}
