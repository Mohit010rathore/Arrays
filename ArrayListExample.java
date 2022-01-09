package com.Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
      //when u dont know how much size we want it is like vector in cpp
        //syntax
        //u cant use primitives u can use wrapper classes
        //wrapper classes->The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
        //Boolean,Character,Byte,Short,Integer,Long,Float,Double
        ArrayList<Integer> list=new ArrayList<>(10);
        //we have many functions
        list.add(67);
        list.add(23);
//        list.contains(23);
//        list.set(0,99); //0th index value replaced by value 99
//        list.remove(1); //remove value at index 1


        System.out.println(list.get(1));
//         System.out.println(list.contains(23));


    }
}
