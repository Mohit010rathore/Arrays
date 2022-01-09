package com.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={4,2,7,9,3,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //using two pointer method
    static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i, int i1) {
        int temp;
        temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
