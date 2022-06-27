package com.java.homework.les15;

public class ConvertF implements Convertable{
    @Override
    public double convert(double temperatureC) {
        return temperatureC * 1.8 + 32;
    }
}
