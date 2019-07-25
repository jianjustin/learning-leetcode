package org.learning.leetcode.sort;

public class CountingSort {

    public static void countingSort(int[] A, int[] B, int k) {
        int[] C = new int[k];

        for (int j = 0; j < A.length; j++)
            C[A[j]] += 1;
        for (int i = 1; i < k; i++)
            C[i] = C[i] + C[i - 1];

        for (int j = A.length - 1; j >= 0; j--) {
            B[C[A[j]] - 1] = A[j];
            C[A[j]] -= 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,34,3,67};
        int[] arr1 = new int[arr.length];
        countingSort(arr,arr1,100);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"   ");
        }
    }

}
