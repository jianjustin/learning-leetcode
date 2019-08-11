public class Solution {

    public int countSegments(String s) {
        int count = 0 , item = 0;
        for (int i = 0; i < s.trim().length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                count++;
                item = 0;
            }
            if (!Character.isSpaceChar(s.charAt(i))) item++;
        }
        if (item > 0)count++;
        return count;
    }

    public boolean isSegment(char c){
        if (65 <= c && c <= 90)return true;
        if (97 <= c && c <= 122)return true;
        return false;
    }

}
