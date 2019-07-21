public class Solution {

    public String[] findWords(String[] words) {

        String[] keybroad = {"qwertyuiop","asdfghjkl","zxcvbnm"},result1 = new String[words.length] , result;

        int a = 0 , b = 0 , c = 0,sum = 0 , item = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (keybroad[0].indexOf(words[i].substring(j,j+1).toLowerCase())> -1)a++;
                if (keybroad[1].indexOf(words[i].substring(j,j+1).toLowerCase())> -1)b++;
                if (keybroad[2].indexOf(words[i].substring(j,j+1).toLowerCase())> -1)c++;
            }
            if((a == 0 && b == 0)||(c == 0 && b == 0)||(a == 0 && c == 0)){
                sum++;
                result1[i] = words[i];
            }
            a = 0;
            b = 0;
            c = 0;
        }

        result = new String[sum];
        for (int i = 0; i < result1.length; i++) {
            if(null != result1[i] && !"".equals(result1[i]))
                result[item++] = result1[i];
        }

        return result;

    }
}
