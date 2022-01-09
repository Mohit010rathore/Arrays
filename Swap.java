package com.Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,3,54,12,34};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp;
        temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
