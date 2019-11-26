public class Solution {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0)return len;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                while (len > 0 && nums[len-1] == val)len--;
                if(i >= len )break;
                nums[i] = nums[--len];
            }
        }
        return len;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {4,5};
        int val = 4;
        System.out.print(solution.removeElement(nums,val));
    }

}
