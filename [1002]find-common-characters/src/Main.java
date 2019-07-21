import java.util.List;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String[] s = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
        List<String> list = solution.commonChars(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
