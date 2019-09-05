import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size() , min;

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (0 == j)triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j));
                else if (j+1 == triangle.get(i).size())triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j-1));
                else triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1)));
            }
        }

        min = triangle.get(len-1).get(0);
        for (int i = 1; i < triangle.get(len-1).size(); i++)
            min = Math.min(min,triangle.get(len-1).get(i));

        return min;
    }
}
