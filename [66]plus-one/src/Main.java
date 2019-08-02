public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        int[] nums1 = solution.plusOne(nums);

        for (int num2:nums1) {
            System.out.print(num2 + "   ");
        }
    }
}
