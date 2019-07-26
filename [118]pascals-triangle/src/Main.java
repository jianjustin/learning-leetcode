import java.util.List;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        List<List<Integer>> list = solution.generate(5);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}
