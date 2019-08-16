public class Solution {

    public int countBinarySubstrings(String s) {
        int a = 1 , b = s.length() , count = 0;
        String item = "01" , item1 = "10";

        while (a <= b/2){
            count += appearNumber(s,item);
            count += appearNumber(s,item1);
            item = "0" + item + "1";
            item1 = "1" + item1 + "0";
            a++;
        }
        return count;
    }

    public int appearNumber(String srcText, String findText) {
        int count = 0;
        int index = 0;
        while ((index = srcText.indexOf(findText, index)) != -1) {
            index = index + findText.length();
            count++;
        }
        return count;
    }

}
