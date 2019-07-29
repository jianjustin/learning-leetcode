import java.util.List;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(3);
        for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
        }
    }
}
