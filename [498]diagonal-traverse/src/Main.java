public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] nums = {{ 1, 2, 3 },{4, 5, 6 },{7, 8, 9 }};
        int[] result = solution.findDiagonalOrder(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
    }
}
