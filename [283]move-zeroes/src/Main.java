public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] A = {0,1,0,3,12};
        solution.moveZeroes(A);

        for (int i = 0; i < A.length; i++)
            System.out.print(A[i]+"  ");
        System.out.println();


    }
}
