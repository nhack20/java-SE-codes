package com.company;
import java.net.*;
import java.util.*;
import java.io.*;

public class Server{

    public static void main(String[] args) {

        try{

            ServerSocket server = new ServerSocket(1989);

            System.out.println("Waiting a client");
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

            String text = "";

            while((text=(String)inStream.readObject())!=null){

                System.out.println(text);

            }

            inStream.close();
            outStream.close();
            socket.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}