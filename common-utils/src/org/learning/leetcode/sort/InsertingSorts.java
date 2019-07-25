package org.learning.leetcode.sort;

public class InsertingSorts {

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

    public static void main(String[] args){
        int[] arr = {2,1,5,34,3,67};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }

    }
}
