public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] A = {4,2,5,7};
        int[] B = solution.sortArrayByParityII(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
}
