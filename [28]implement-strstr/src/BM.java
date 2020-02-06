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

        int[] bad_table = build_bad_table(pattern) , good_table = build_good_table(pattern);

        for (int i = pLen - 1, j; i < tLen;) {
            for (j = pLen - 1; target.charAt(i) == pattern.charAt(j); i--, j--)
                if (j == 0) return i;
            i += Math.max(good_table[pLen - j - 1], bad_table[target.charAt(i)]);
        }
        return -1;
    }

    /**
     * 字符信息表
     */
    public static int[] build_bad_table(String pattern) {
        int table_size = 256 , len = pattern.length();
        int[] bad_table = new int[table_size];

        for (int i = 0; i < bad_table.length; i++)
            bad_table[i] = len;

        for (int i = 0; i < len - 1; i++)
            bad_table[pattern.charAt(i)] = len - 1 - i;

        return bad_table;
    }

    /**
     * 匹配偏移表
     */
    public static int[] build_good_table(String pattern) {
        int pLen = pattern.length() , lastPrefixPosition = pLen;
        int[] good_table = new int[pLen];

        for (int i = pLen - 1; i >= 0; --i) {
            if (isPrefix(pattern, i + 1))
                lastPrefixPosition = i + 1;
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
        int patternLength = pattern.length();
        for (int i = p, j = 0; i < patternLength; ++i, ++j)
            if (pattern.charAt(i) != pattern.charAt(j)) return false;
        return true;
    }

    /**
     * 后缀匹配
     */
    public static int suffixLength(String pattern, int p) {
        int pLen = pattern.length() , len = 0;
        for (int i = p, j = pLen - 1; i >= 0 && pattern.charAt(i) == pattern.charAt(j); i--, j--)
            len++;
        return len;
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB" , pat = "ABABCABAB";
        System.out.println(BM.pattern(pat,txt));
    }
}
