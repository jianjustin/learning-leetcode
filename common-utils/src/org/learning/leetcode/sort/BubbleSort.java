package org.learning.leetcode.sort;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        int newn;
        do {
            newn = 0;
            for (int i = 1; i < n; i++)
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    T temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
        } while (newn > 0);
    }

    public static void main(String[] args){
        Integer[] arr = {2,1,5,34,2,67};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }

    }
}
