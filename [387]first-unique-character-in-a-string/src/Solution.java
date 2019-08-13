public class Solution {

    public int firstUniqChar(String s) {
        int[] count = new int[26] , items1 = new int[26];
        char[] items = new char[26];

        int key = 0;
        for (int i = 0; i < s.length(); i++) {
            if (0 == count[s.charAt(i) - 97]){
                items[key] = s.charAt(i);
                items1[key++] = i;
            }
            count[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < key; i++)
            if (items[i] >= 65 && items[i] <= 122  && 1 == count[items[i] - 97])return items1[i];

        return -1;

    }
}
