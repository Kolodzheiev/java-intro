package com.java.homework.les14;

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
