public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target == (nums[i]+nums[j])){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] a = {-3,4,3,90};
        int target = 0;
        int[] result = solution.twoSum(a,target);
        System.out.println(result[0]+"    "+result[1]);
    }


}
