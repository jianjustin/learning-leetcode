public class Solution {

    public int findJudge(int N, int[][] trust) {
        int judge = -1;
        int[][] graph = new int[N][N];
        for (int i = 0; i < trust.length; i++)
            graph[trust[i][0]-1][trust[i][1]-1] = 1;//设置节点的边
        for (int i = 0; i < graph.length; i++) {
            int m = 0,n = 0;
            for (int j = 0; j < graph[i].length; j++) {
                if(1 == graph[i][j])break;//检查出度是否都为0
                if(1 != graph[j][i] && i != j)break;//检查入度是否满
                if(j+1 == N)judge = i+1;
            }
        }
        return judge;

    }
}
