package org.learning.leetcode.sort;

public class InsertingSorts {

    /**
     * 插入排序
     */
    public static void insertSort(int[] a) {
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
    }
}
