package com.matianxing;

public class Bicycle extends Bike {
    public int pedalNum;

    public Bicycle(int wn, int pn, String wheelShape, String seatShape) {
        super(wn,wheelShape,seatShape);
        this.pedalNum = pn;
    }

    public int getPedalNum() {
        System.out.println("i am in the getPedalNum");
        return this.pedalNum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Bicycle adultBicycle = new Bicycle(5, 9, "round", "chair");
        System.out.println(adultBicycle);
        int wn = adultBicycle.getWheelNum();
        System.out.println(wn);
        int pn = adultBicycle.getPedalNum();
        System.out.println(pn);
    }

}
