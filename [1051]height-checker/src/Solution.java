public class Solution {

    public int heightChecker(int[] heights) {
        int[] b = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            b[i] = heights[i];
        }

        Solution.insertSort(heights);

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            if(heights[i] != b[i])
                sum++;
        }

        return sum;
    }

    public static int[] insertSort(int[] a) {
        int i, j, insertNote;
        for (i = 1; i < a.length; i++) {
            insertNote = a[i];
            j = i - 1;
            while (j >= 0 && insertNote < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = insertNote;
        }
        return a;
    }
}
