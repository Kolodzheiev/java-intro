package com.java.homework.les7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWash {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many cars need to be washed");
        int dirtyCars = Integer.parseInt(in.readLine());

    //    washingSteps1(dirtyCars);
        washingSteps2(dirtyCars);

        System.out.println("Cars washed");

    }
    public static void washingSteps1(int dirtyCars){
        while (dirtyCars != 0) {

            soapCar(dirtyCars);
            washCar(dirtyCars);
            dryCar(dirtyCars);
            dirtyCars--;
        }
    }public static void washingSteps2(int dirtyCars){
        for (; dirtyCars!=0;dirtyCars--){
            soapCar(dirtyCars);
            washCar(dirtyCars);
            dryCar(dirtyCars);
        }

    }


    public static void soapCar(int dirtyCars) {
        System.out.println("The car is washing " + dirtyCars);
    }

    public static void washCar(int dirtyCars) {
        System.out.println("The car is being washed " + dirtyCars);
    }

    public static void dryCar(int dirtyCars) {
        System.out.println("The car is drying " + dirtyCars);
    }

}
