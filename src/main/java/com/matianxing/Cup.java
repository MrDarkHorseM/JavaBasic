package com.matianxing;

public class Cup {
    public int handerNum;
    public int pouredAccumlator;

    public Cup(int num, String lid){
        this.handerNum = num;
    };
    public int getHanderNum(){
        System.out.println("i am in the getHanderNum");
        return this.handerNum;
    }

    public void pour(int lit){
        pouredAccumlator=pouredAccumlator+lit;
        System.out.println("I have poured "+lit+" water");
    }
    public int getPouredAccumlator(){
        return pouredAccumlator;
    }


    public static void main(String[] args){
        System.out.println("Hello World");
        Cup kiddyCup = new Cup( 5, "around");
        String str="random";
        System.out.println(kiddyCup);
        int num = kiddyCup.getHanderNum();
        System.out.println(num);
        kiddyCup.pour( 10);
        kiddyCup.pour( 5);
        System.out.println(kiddyCup.getPouredAccumlator());
    }

}
