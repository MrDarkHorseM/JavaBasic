package com.matianxing;

public class Motorcycle extends Bike{
    public int pedalNum;
    public String gasTank;
    public String motor;

    public Motorcycle(int wn, int pn, String wheelShape, String seatShape, String gasTank, String motor) {
        super(wn,wheelShape,seatShape);
        this.pedalNum = pn;
    }

    public int getPedalNum() {
        System.out.println("i am in the getPedalNum");
        return this.pedalNum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Motorcycle adultMotorcycle = new Motorcycle(5, 9, "round", "chair", "round", "Honda");
        System.out.println(adultMotorcycle);
        int wn = adultMotorcycle.getWheelNum();
        System.out.println(wn);
        int pn = adultMotorcycle.getPedalNum();
        System.out.println(pn);
    }

}