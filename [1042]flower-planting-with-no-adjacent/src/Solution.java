import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] answer = new int[N];
        Set<Integer>[] graph = new Set[N];

        for (int i = 0; i < N; i++)
            graph[i] = new HashSet<Integer>();

        /*初始化边数据*/
        for (int i = 0; i < paths.length; i++){
            graph[paths[i][0]-1].add(paths[i][1]-1);
            graph[paths[i][1]-1].add(paths[i][0]-1);
        }

        for (int i = 0; i < N; i++) {
            boolean[] used = new boolean[5];
            for (int j = 0; j < graph[i].size(); j++)
                used[answer[j]] = true;
            for (int j = 1; j <= 4; j++)
                if (!used[j])
                    answer[i] = j;
        }
        return answer;
    }

    public int[] gardenNoAdj1(int N, int[][] paths) {
        Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>();

        for (int i = 0; i < N; i++)
            graph.put(i, new HashSet<Integer>());
        for (int[] path: paths) {
            graph.get(path[0] - 1).add(path[1] - 1);
            graph.get(path[1] - 1).add(path[0] - 1);
        }

        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            boolean[] used = new boolean[5];
            for (int adj: graph.get(i))
                used[res[adj]] = true;
            for (int j = 1; j <= 4; j++)
                if (!used[j])
                    res[i] = j;
        }
        return res;
    }
}
