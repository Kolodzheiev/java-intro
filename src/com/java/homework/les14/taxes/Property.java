package com.java.homework.les14.taxes;

public class Property {
    protected int square;
    protected double taxPerSquareMeter;

    public Property(int square, double taxPerSquareMeter){
        this.square = square;
        this.taxPerSquareMeter = taxPerSquareMeter;
    }

    public double calculateTax() {
        return square * taxPerSquareMeter;
    }

}
