import java.util.List;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1,1};
        List<Integer> list = solution.findDisappearedNumbers(nums);
        System.out.print(list.toString());
    }
}
