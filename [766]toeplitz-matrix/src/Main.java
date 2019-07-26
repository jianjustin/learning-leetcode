public class Main {

    public static void main(String[] args){
        //int[][] matrix = {{1,2,3,4}, {5,1,2,3},{9,5,1,2}};
        int[][] matrix = {{1,2},{2,2}};
        Solution solution = new Solution();
        boolean result = solution.isToeplitzMatrix(matrix);
        System.out.print(result);
    }
}
