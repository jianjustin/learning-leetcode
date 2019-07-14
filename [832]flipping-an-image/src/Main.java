public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] B = solution.flipAndInvertImage(A);

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }
}
