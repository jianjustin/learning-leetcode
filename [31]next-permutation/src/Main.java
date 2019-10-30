public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,2};
        solution.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "    ");
        }
    }
}
