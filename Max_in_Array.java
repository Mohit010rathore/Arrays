package com.Arrays;

public class Max_in_Array {
    public static void main(String[] args) {
        int [] arr={4,24,6,9,29,67,87};
       // System.out.println(maxArray(arr));
        System.out.println(maxArrayInRange(arr,0,6));
    }

//    static int maxArray(int[] arr) {
//        int max=arr[0];
//        for(int i=0;i<arr.length;i++)
//        {
//            if(max<arr[i])
//            {
//                max=arr[i];
//            }
//        }
//        return max;
//    }

    //in between range

    static int maxArrayInRange(int[] arr,int start,int end) {
        int max=arr[0];
        for(int i=start;i<end;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}
