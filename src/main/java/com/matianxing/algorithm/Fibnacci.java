package com.matianxing.algorithm;

public class Fibnacci {

    public int fib(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            if(i == 0) {
                result[i] = 0;
            }else
            if(i == 1) {
                result[i] = 1;
            }else
            result[i] = result[i-1] + result[i-2];
        }
        System.out.println(result[n-1]);
        return result[n-1];
    }

    public static void main(String[] args){
        int n = 5;
        Fibnacci instance = new Fibnacci();
        instance.fib(n);
    }

}
