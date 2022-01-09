package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //->the primitive data types are the predefined data types of Java.
        // They specify the size and type of any standard values. Java has 8 primitive data types namely byte, short, int, long, float, double, char and boolean.
        // When a primitive data type is stored, it is the stack that the values will be assigned.
        // When a variable is copied then another copy of the variable is created and changes made to the copied variable will not reflect changes in the original variable

        //array of primitives
//        int[] arr=new int[6];
//        for(int i=0;i<6;i++)
//        {
//            arr[i]=input.nextInt();
//        }
//        for(int i=0;i<6;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

        //another way to print elements

//        for(int num:arr)//for every element in array, print the element
//        {
//            System.out.println(num+" ");//here num represents elemnts of the array
//        }
//        System.out.println(Arrays.toString(arr));//converts array into string

        //array of objects->These are also referred to as Non-primitive or Reference Data Type.
        // They are so-called because they refer to any particular objects. Unlike the primitive data types, the non-primitive ones are created by the users in Java. Examples include arrays, strings, classes, interfaces etc. When the reference variables will be stored, the variable will be stored in the stack and the original object will be stored in the heap. In Object data type although two copies will be created they both will point to the same variable in the heap, hence changes made to any variable will reflect the change in both the variables

        //array of objects
        String[] str=new String[4];
        for(int i=0;i<str.length;i++)
        {
            str[i]= input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
