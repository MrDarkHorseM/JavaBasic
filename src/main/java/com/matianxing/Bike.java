package com.matianxing;

public class Bike {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    public Bike(int num, String wheelShape, String seatShape) {
        this.wheelNum = num;
    }

    public int getWheelNum() {
        System.out.println("i am in the getWheelNum");
        return this.wheelNum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Bike childBike = new Bike(5, "round", "chair");
//    String str="random";
        System.out.println(childBike);
        int num = childBike.getWheelNum();
        System.out.println(num);
    }

}
