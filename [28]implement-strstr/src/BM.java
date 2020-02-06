import java.util.HashMap;
import java.util.Map;

/**
 * BM算法｜字符串匹配算法
 */
public class BM {
    /**
     * 算法匹配
     */
    public static int pattern(String pattern, String target) {
        int tLen = target.length() , pLen = pattern.length();
        if (pLen > tLen) return -1;

        int[]  good_table = build_good_table(pattern);
        Map<Character,Integer> bad_table = build_bad_table(pattern);

        for (int i = pLen - 1, j; i < tLen;) {
            for (j = pLen - 1; target.charAt(i) == pattern.charAt(j); i--, j--)
                if (j == 0) return i;
            int a = null == bad_table.get(target.charAt(i))?pattern.length():bad_table.get(target.charAt(i));
            i += Math.max(good_table[pLen - j - 1], a);
        }
        return -1;
    }

    /**
     * 字符信息表
     */
    public static Map<Character,Integer> build_bad_table(String pattern) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < pattern.length() - 1; i++)
            map.put(pattern.charAt(i),pattern.length()-i-1);//计算字符最后出现位置
        return map;
    }

    /**
     * 匹配偏移表
     */
    public static int[] build_good_table(String pattern) {
        int pLen = pattern.length() , lastPrefixPosition = pLen;
        int[] good_table = new int[pLen];

        for (int i = pLen - 1; i >= 0; --i) {
            if (isPrefix(pattern, i + 1))lastPrefixPosition = i + 1;
            good_table[pLen - 1 - i] = lastPrefixPosition - i + pLen - 1;
        }

        for (int i = 0; i < pLen - 1; ++i) {
            int slen = suffixLength(pattern, i);
            good_table[slen] = pLen - 1 - i + slen;
        }
        return good_table;
    }

    /**
     * 前缀匹配
     */
    public static boolean isPrefix(String pattern, int p) {
        for (int i = p, j = 0; i < pattern.length(); ++i, ++j)
            if (pattern.charAt(i) != pattern.charAt(j)) return false;
        return true;
    }

    /**
     * 后缀匹配
     */
    public static int suffixLength(String pattern, int p) {
        int pLen = pattern.length() , len = 0;
        for (int i = p, j = pLen = pattern.length() - 1; i >= 0 && pattern.charAt(i) == pattern.charAt(j); i--, j--)
            len++;
        return len;
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB" , pat = "ABABCABAB";
        System.out.println(BM.pattern(pat,txt));
    }
}
