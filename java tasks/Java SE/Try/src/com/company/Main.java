package com.company;

import java.awt.image.RasterOp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your count of users:");
        int n = scan.nextInt();
        int sum=0,c=0;
        User[] u1 = new User[n];


        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Enter name");
                String name=scan.next();
                System.out.println("Enter your surname");
                String surname=scan.next();
                System.out.println("Enter your age");
                int age=scan.nextInt();
                u1[i]=new User(name,surname,age);
             sum+=u1[i].age;
             c=sum/u1.length;


            }
            catch (InputMismatchException e){
                System.out.println("Input Incorrect");
                System.out.println("Programm finished");

            }

            ///System.out.println(u1[i]);




            /*u[i]={name,surname,age};*/

        }

        System.out.println("_________");
        System.out.println(c);

    }
}
