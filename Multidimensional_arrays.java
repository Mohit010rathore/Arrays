package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_arrays {
    public static void main(String[] args) {
         /*
             1 2 3
             4 5 6
             7 8 9
          */

        Scanner input=new Scanner(System.in);
//        int[][] arr2D={
//                {1,2,3}, //0th index
//                {4,5}, //1st index
//                {6,7,8} //2nd index
//        };//here each array is a different object

        int [][] arr=new int[3][3];
        System.out.println(arr.length);//gives us no of rows

        //input
        //outer for loop iterating each row
        for(int row=0;row<arr.length;row++){
            //for each colomn  in every row
            //for every row we are iterating each colomn
            for (int col=0;col<arr[row].length;col++)//size(arr[o])=3,size(arr[1])=2 like this
            {
                 arr[row][col]= input.nextInt();
            }
        }
        //for printing
//        for(int row=0;row<arr.length;row++){
//
//            for (int col=0;col<arr[row].length;col++)
//            {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();//new line
//        }
        //output
        for(int row=0;row<arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
            //arr[row->0,1,2 and as follows] is an array itself
        }
        //enhanced for loop
        for(int [] a:arr)//here array itself is an element
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
