package com.java.homework.les14.taxes;

public class CommercialRealEstate extends PropertyTax {
    protected static double MIN_PROCEEDS = 100;
    protected double proceeds;

    public CommercialRealEstate(int square, double taxPerSquareMeter, double proceeds) {
        super(square, taxPerSquareMeter);
        this.proceeds = proceeds;
    }

    @Override
    public double calculateTax() {
        if (proceeds < MIN_PROCEEDS) {
            System.out.println("РАДІЙ, НАЛОГУ НЕ БУДЕ !!! :)");
            return 0;
        }
        return super.calculateTax();
    }
}
