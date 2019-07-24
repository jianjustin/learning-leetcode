public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
       int N = 3;
       int[][] paths = {{1,2},{2,3},{3,1}};
       int[] result = solution.gardenNoAdj(N,paths);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
