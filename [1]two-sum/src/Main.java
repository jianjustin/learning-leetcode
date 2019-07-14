public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] a = {-3,4,3,90};
        int target = 0;
        int[] result = solution.twoSum(a,target);
        System.out.println(result[0]+"    "+result[1]);
    }
}
