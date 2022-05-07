package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        CarThread c1 = new CarThread("Mercedes", 30, 5);
//        CarThread c2 = new CarThread("Toyota", 25, 10);
//
//        c1.start();
//        c2.start();
        Scanner in = new Scanner(System.in);
        // write your code here
        Car c1 = new Car("Toyota", 120, 2000);
        Car c2 = new Car("Mers", 150, 3000);
        Car c3 = new Car("BMW", 180, 2500);
        Car[] c = {c1, c2, c3};
        c1.start();
        c2.start();
        c3.start();
    }
}

