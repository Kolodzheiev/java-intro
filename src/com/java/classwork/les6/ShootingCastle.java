package com.java.classwork.les6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShootingCastle {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите растояние пкоторое пролетел снаряд");
        int shooting = Integer.parseInt(in.readLine());
        isShooting(shooting);


    }

    public static void isShooting(int shooting) {
        if (1500 >= shooting && shooting >= 1000) {
            System.out.println("Попал");
        } else {
            System.out.println("Непопал");
        }

    }
}
