public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] A = {-4,-1,0,3,10};
        int[] B = solution.sortedSquares(A);

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+"      ");
        }
    }
}
