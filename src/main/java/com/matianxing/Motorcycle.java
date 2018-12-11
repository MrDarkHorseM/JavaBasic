package com.matianxing;

public class Motorcycle {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;
    public int pedalNum;
    public String gasTank;
    public String motor;

    public Motorcycle(int num1, int num2, String wheelShape, String seatShape, String gasTank, String motor) {
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
        Motorcycle adultMotorcycle = new Motorcycle(5, 9, "round", "chair", "round", "Honda");
//    String str="random";
        System.out.println(adultMotorcycle);
        int num1 = adultMotorcycle.getWheelNum();
        System.out.println(num1);
        int num2 = adultMotorcycle.getPedalNum();
        System.out.println(num2);
    }

}