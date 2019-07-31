import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        char[] str = S.toCharArray();

        int m = 0 , n = 0;
        char key = str[0];
        for (int i = 1; i < str.length; i++) {
            if(str[i] == key)
                n++;
            else{
                if(n-m >= 2){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(0,m);
                    list.add(1,n);
                    result.add(list);
                }
                m = n = i;
                key = str[m];
            }
        }

        if(n-m >= 2){
            List<Integer> list = new ArrayList<Integer>();
            list.add(0,m);
            list.add(1,n);
            result.add(list);
        }

        return result;
    }

}
