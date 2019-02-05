package com.matianxing.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BaseballGame {

    public static int calculatePoints(String[] moves) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String move : moves) {
            switch(move){
                case("C"):
                    sum -= stack.pop();
                    break;
                case("D"):
                    int score = 2 * stack.peek();
                    sum += score;
                    stack.push(score);
                    break;
                case("+"):
                    int first = stack.pop();
                    int second = first + stack.peek();
                    sum += second;
                    stack.push(first);
                    stack.push(second);
                    break;
                default:
                    int basic = Integer.valueOf(move);
                    stack.push(basic);
                    sum += basic;
                    break;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){
        String[] test = {"5","-2","4","C","D","9","+","+"};

//        ArrayList train = new ArrayList<String>(Arrays.asList("5","-2","4","C","D","9","+","+"));

        calculatePoints(test);
    }

}
