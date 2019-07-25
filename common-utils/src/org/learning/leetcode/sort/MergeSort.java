package org.learning.leetcode.sort;

public class MergeSort {

    public static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)return;
        int len = end - start, mid = (len >> 1) + start , start1 = start, end1 = mid , start2 = mid + 1, end2 = end , k = start;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    public static void merge_sort(int[] arr) {
        int[] orderedArr = new int[arr.length];
        for (int i = 2; i < arr.length * 2; i *= 2) {
            for (int j = 0; j < (arr.length + i - 1) / i; j++) {
                int left = i * j;
                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
                int start = left, l = left, m = mid;
                while (l < mid && m <= right) {
                    if (arr[l] < arr[m])
                        orderedArr[start++] = arr[l++];
                    else
                        orderedArr[start++] = arr[m++];
                }
                while (l < mid)
                    orderedArr[start++] = arr[l++];
                while (m <= right)
                    orderedArr[start++] = arr[m++];
                System.arraycopy(orderedArr, left, arr, left, right - left + 1);
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {13,14,94,33,82,25,59,94,65,23,45,27,73,25,39,10};
        merge_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }

    }
}
