package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter of length of array:  ");
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter " + (i + 1));
                array[i] = in.nextInt();
                for (int j = 0; j < array.length- i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }

                }

            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }






