public class Solution {

    public String gcdOfStrings(String str1, String str2) {
        int a = 0 , b = str2.length();
        while (b > a){
            String str3 = str2.substring(a,b);
            if (str1.length()%str3.length()!=0 || str2.length()%str3.length()!=0){
                b--;
                continue;
            }
            if ("".equals(str1.replaceAll(str3,"")) &&  "".equals(str2.replaceAll(str3,"")))
                return str3;
            else
                b--;
        }
        return "";
    }

}
