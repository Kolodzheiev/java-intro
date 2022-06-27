package com.java.homework.les15;

public class ConvertK implements Convertable{

    @Override
    public double convert(double temperatureC) {
        return temperatureC + 273.15;
    }
}
