import java.util.List;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "abbxxxxzzy";
        List<List<Integer>> list = solution.largeGroupPositions(s);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("["+list.get(i).get(0)+","+list.get(i).get(1)+"]");
        }
    }
}
