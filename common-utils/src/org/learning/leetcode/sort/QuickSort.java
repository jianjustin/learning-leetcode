package org.learning.leetcode.sort;

public class QuickSort {

    public static void quickSort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) return;
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                ++i;
            while (arr[j] > pivot)
                --j;
            if (i < j) {
                int t = arr[i];
                arr[i++] = arr[j];
                arr[j--] = t;
            }
            if (i == j)
                ++i;
        }
        quickSort(arr, head, j);
        quickSort(arr, i, tail);
    }

    public static void main(String[] args){
        int[] arr = {2,1,5,34,3,67};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }

    }
}
