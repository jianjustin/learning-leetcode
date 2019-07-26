public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] nums = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] result = solution.matrixReshape(nums,r,c);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
