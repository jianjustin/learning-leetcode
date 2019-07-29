public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] B = solution.sumEvenAfterQueries(A,queries);

        for (int i = 0; i < B.length; i++)
            System.out.print(B[i]);

    }
}
