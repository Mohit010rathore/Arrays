package com.Arrays;

import java.util.Arrays;

public class passing_in_function {
    public static void main(String[] args) {
        int[] nums={1,2,3,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int [] arr){
        arr[0]=43;
    }

}
