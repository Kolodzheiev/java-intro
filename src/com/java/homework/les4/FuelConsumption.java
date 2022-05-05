package com.java.homework.les4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuelConsumption {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть кількість кілометрів");
        int km = Integer.parseInt(in.readLine());
        System.out.println("Введіть кількість літрів");
        double litre = Double.parseDouble(in.readLine());

        double consumption = calculateConsumption( km, litre);
        System.out.println("Расход палива -  "+consumption+" l/100 km");

    }
    public static double calculateConsumption(int km,double litre) {
        return litre / km * 100;
    }
}
