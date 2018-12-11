package com.matianxing;

public class Bicycle {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;
    public int pedalNum;

    public Bicycle(int num1, int num2, String wheelShape, String seatShape) {
        this.wheelNum = num1;
        this.pedalNum = num2;
    }

    public int getWheelNum() {
        System.out.println("i am in the getWheelNum");
        return this.wheelNum;
    }

    public int getPedalNum() {
        System.out.println("i am in the getPedalNum");
        return this.pedalNum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Bicycle adultBicycle = new Bicycle(5, 9, "round", "chair");
//    String str="random";
        System.out.println(adultBicycle);
        int num1 = adultBicycle.getWheelNum();
        System.out.println(num1);
        int num2 = adultBicycle.getPedalNum();
        System.out.println(num2);
    }

}
