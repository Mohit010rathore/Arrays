package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        //creating array list of array list
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

         //initialization
        for(int i=0;i<3;i++)//here we create individual list
        {
            list.add(new ArrayList<>());
        }

        //add element
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(input.nextInt());
                //get the array list at index i and add something to it
            }
        }
        System.out.println(list);
    }
}
