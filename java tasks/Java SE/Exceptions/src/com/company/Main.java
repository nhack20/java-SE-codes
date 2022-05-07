package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(7));//13
//  int count = scanner.nextInt();
//        ///int count=7;
//        int num1 = 0, num2 = 1;
//        System.out.print("Fibonacci  " + count + " numbers:");
//
//        int i = 1;
//        while (i <= count) {
//            System.out.print(num1 + " ");
//            int sumOfPrevTwo = num1 + num2;
//            num1 = num2;
//            num2 = sumOfPrevTwo;
//            i++;
//        }
    }
    public static int fibonacci(int n)  {
        if(n == 0)//0->0
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);////
    }
}
///  System.out.println(fibonacci(7));


//task 5
//        try{
//            BufferedReader br =
//                    new BufferedReader (new FileReader("t324.txt"));
//            String s;
//            while((s=br.readLine())!=null){
//                System.out.println(s);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }




///task3
//        try{
//            BufferedWriter writer =
//                    new BufferedWriter(new FileWriter("file.txt"));
//            String message = "Hello Nurs";
//            writer.write(message);
//            writer.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//Task2 /validate data
//        int num;
//        try {
//            num=scanner.nextInt();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("Program finished");


// write your code here
//
//String validatePhoneNumber=scanner.next();
// try {
//     validatePhoneNumber="^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";
//
// }catch(Exception e){
//     System.out.println("Please enter a valida email");
//        }
//        String string = scanner.next();
//        String str = "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?";
//        try {
//
//        } catch (Exception e) {
//        }
