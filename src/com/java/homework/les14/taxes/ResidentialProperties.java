package com.java.homework.les14.taxes;

public class ResidentialProperties extends PropertyTax {
    protected double subsidy;

    public ResidentialProperties(int square, double taxPerSquareMeter, int subsidy) {
        super(square, taxPerSquareMeter);
        this.subsidy = subsidy;
    }
    @Override
    public double calculateTax() {
        double tax = super.calculateTax();
        double discount = tax / 100 * subsidy;
        return tax - discount;
    }
}
