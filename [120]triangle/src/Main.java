import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] d = {{2},{3,4},{6,5,7},{4,1,8,3}};
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for (int i = 0; i < d.length; i++) {
            triangle.add(new ArrayList<Integer>());
            for (int j = 0; j < d[i].length; j++) {
                triangle.get(i).add(d[i][j]);
            }
        }

        System.out.println(solution.minimumTotal(triangle));
    }
}
