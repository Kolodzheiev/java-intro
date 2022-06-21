package com.java.homework.les14.taxes;

public class PropertyTax {
    protected int square;
    protected double taxPerSquareMeter;

    public PropertyTax(int square,double taxPerSquareMeter){
        this.square = square;
        this.taxPerSquareMeter = taxPerSquareMeter;
    }

    public double calculateTax() {
        return square * taxPerSquareMeter;
    }

}
