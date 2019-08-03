public class Main {

    public static void main(String[] args){
        Solution1 solution = new Solution1();
        int[] nums = {2, 7, 11, 15};
        int key = 9;
        int[] nums1 = solution.twoSum(nums,key);

        System.out.println(nums1[0]);
        System.out.println(nums1[1]);
    }
}
