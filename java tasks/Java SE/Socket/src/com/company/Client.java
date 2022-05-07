package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {

            Socket socket = new Socket("127.0.0.1", 1989);
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

            System.out.println("INSERT YOUR NAME:");
            String name = in.next();

            while (true) {

                System.out.println("PRESS 1 TO SEND MESSAGE");
                System.out.println("PRESS 0 TO EXIT");

                String choice = in.next();

                if (choice.equals("1")) {

                    System.out.println("INSERT MESSAGE:");
                    String message = in.next();

                    outStream.writeObject(name + " : " + message);

                } else if (choice.equals("0")) {
                    break;
                }

            }

            socket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}