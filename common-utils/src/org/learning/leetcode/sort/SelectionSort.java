package org.learning.leetcode.sort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int min, count = arr.length;
        for (int i = 0; i < count; i++) {
            min = i;
            for (int j = i; j < count; j++) {
                if(arr[min] > arr[j])
                    min = j;
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {2,1,5,34,3,67};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }

}
