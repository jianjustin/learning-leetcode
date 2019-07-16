import java.util.Arrays;

public class Solution {

    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for(char ch : tasks)
            arr[ch-65]++;//获取每类任务数目
        Arrays.sort(arr);
        int i = 25 , max = arr[25] , all = tasks.length;
        while(i>=0 && arr[i]==max)
            i--;//检查具有同样最大数量的字符

        int maxNum = 25 -i , cnt = all-max , blank = (max-1)*n;//cnt指剩余字符量，blank指可容纳字符量
        if(blank>=cnt)
            return blank+max+maxNum-1;
        return tasks.length;
    }
}
