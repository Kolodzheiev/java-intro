package com.java.homework.les4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airplane {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("create airplane 1");

        System.out.println("input type");
        String type1 = in.readLine();
        System.out.println("input model");
        String model1 = in.readLine();

        airplane(type1,model1);

        System.out.println("create airplane 2");
        System.out.println("input type");
        String type2 = in.readLine();
        System.out.println("input model");
        String model2 = in.readLine();
        System.out.println("input economy passengers ");
        int economyPassenger2 = Integer.parseInt(in.readLine());


        airplane(type2,model2,economyPassenger2);

        System.out.println("create airplane 3");
        System.out.println("input Type");
        String type3 = in.readLine();
        System.out.println("input Model");
        String model3 = in.readLine();
        System.out.println("input Economy Passenger ");
        int economyPassenger3 = Integer.parseInt(in.readLine());
        System.out.println("input Business Passenger " );
        int businessPassenger3 = Integer.parseInt(in.readLine());


        airplane(type3,model3,economyPassenger3,businessPassenger3);

    }

    public static void airplane(String type, String model) {
        System.out.println("Type - " +type +", Model - "+ model);

    }

    public static void airplane(String type, String model, int economyPassenger) {
        System.out.println("Type - "+type+", Model - " + model +", Economy Passenger - "+ economyPassenger);

    }

    public static void airplane(String type, String model, int economyPassenger, int businessPassenger) {
        System.out.println("Type  -"+type +", Model - "+ model +", Economy Passenger - "+ economyPassenger+", Business Passenger - " + businessPassenger);

    }
}
