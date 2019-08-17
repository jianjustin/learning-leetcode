public class Solution {

    public boolean checkRecord(String s) {
        int length = s.length();
        if (length - s.replaceAll("A","").length() > 1)return false;
        if (length - s.replaceAll("LLL","").length() > 2)return false;
        return true;
    }
}
