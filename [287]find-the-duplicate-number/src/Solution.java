public class Solution {

    public int findDuplicate(int[] nums) {
        int left = 0 , right = nums.length-1;
        while (left < right){
            int mid = (left + right) >>> 1 , counter = 0;
            for (int num : nums)
                if (num <= mid) counter++;
            if (counter > mid)
                right = mid;
            else
                left = mid + 1;

        }
        return left;
    }
}
