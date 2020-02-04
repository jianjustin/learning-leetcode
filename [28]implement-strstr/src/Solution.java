public class Solution {

    public int strStr(String haystack, String needle) {
        if (null == needle || needle.length() == 0)return 0;
        int  lps[] = new int[needle.length()] , j = 0 , i = 0;

        char[] haystacks = haystack.toCharArray() , needles = needle.toCharArray();

        computeLPSArray(needle, lps);//生成字符匹配表

        while (i < haystack.length()) {
            if (needles[j] == haystacks[i]) {
                j++;
                i++;
            }
            if (j == needle.length()) {
                return i-j;
            }else if (i < haystack.length() && needles[j] != haystacks[i]) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return -1;
    }

    void computeLPSArray(String pat, int lps[]){
        int i = 1 , j = 0 ;

        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(j)) {
                lps[i++] = ++j;//因为j从0开始计数，所以需要先计算j的值
            } else {
                if (j != 0)
                    j = lps[j - 1];
                 else
                    lps[i++] = j;

            }
        }
    }


    public static void main(String args[])
    {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        Solution solution = new Solution();
        System.out.println(solution.strStr(txt,pat));
    }

}
