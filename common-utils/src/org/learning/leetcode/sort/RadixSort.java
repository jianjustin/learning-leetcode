package org.learning.leetcode.sort;

public class RadixSort {

    public static void radixSort(int[] array , int d){
        int n=1 , k = 0 , length=array.length;
        int[][] bucket=new int[10][length];
        int[] order=new int[length];

        while(n<d){
            for(int num:array){
                int digit=(num/n)%10;
                bucket[digit][order[digit]]=num;
                order[digit]++;
            }
            for(int i=0;i<length;i++){
                if(order[i]!=0){
                    for(int j=0;j<order[i];j++)
                        array[k++]=bucket[i][j];
                }
                order[i]=0;
            }
            n*=10;
            k=0;
        }
    }

}
