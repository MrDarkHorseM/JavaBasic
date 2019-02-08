package com.matianxing.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Duplicate {

    public static void setup(){
        int[] myArray;
        myArray = new int[] {4,3,2,7,8,2,3,1};
    }

    public static void findDuplicate(int[] nums){

        ArrayList<Integer> printList = new ArrayList<>();
        int[] myArray = new int[nums.length+1];
        for(int i = 0 ; i < nums.length; i++){
            int index = nums[i];
            int val;
            val = myArray[index];
            myArray[index] = val+1;
        }

        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] > 1){
                printList.add(i);
            }
        }
//        System.out.println(Arrays.toString(myArray));
        System.out.println(printList);
    }

    public static void main(String[] args){
        int[] ArrayB;
        ArrayB = new int[] {4,3,2,7,8,2,3,1};
        findDuplicate(ArrayB);
    }

}
