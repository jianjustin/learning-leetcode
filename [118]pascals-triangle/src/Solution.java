import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list_item = new ArrayList<Integer>();
            for (int j = 1; j <= i; j++) {
                if(j == 1 || j == i)
                    list_item.add(1);
                else
                    list_item.add(list.get(i-2).get(j-2)+list.get(i-2).get(j-1));
            }
            list.add(list_item);
        }
        return list;
    }
}
