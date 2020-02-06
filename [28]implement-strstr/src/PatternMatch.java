/**
 * 字符串匹配算法 - 朴素算法
 */
public class PatternMatch {

    public int patternMatch(String source,String target){
        int i = 0 , j = 0 , len = source.length() , len1 = target.length();

        while (i+len1 <= len){
            for (int k = 0; k < len1; k++) {
                if (target.charAt(k)!=source.charAt(i+k))break;
                if (k+1 == len1)return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String source = "ABABDABACDABABCABAB" , target = "ABABCABAB";
        PatternMatch patternMatch = new PatternMatch();
        System.out.println(patternMatch.patternMatch(source,target));
    }
}
