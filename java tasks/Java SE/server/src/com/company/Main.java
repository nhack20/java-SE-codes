package com.company;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.net.*;
import java.io.*;
import java.util.*;


public class Main {
    public static String encrypt(String password, String key){
        try {
            byte [] keyData = (key).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte [] hasil = cipher.doFinal(password.getBytes());
            return new String(Base64.getEncoder().encode(hasil));
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String string, String key){
        try {
            byte [] keyData = (key).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData, "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte [] hasil = cipher.doFinal(java.util.Base64.getDecoder().decode(string));
            return new String(hasil);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static String ceasar_en(String text, int key){
        String c_cipher = "";
        char letter;

        for(int i = 0; i<text.length(); i++){

            letter = text.charAt(i);

            if((int)letter >= 32 && (int)letter <= 126){

                if((int)letter + key > 126 || (int)letter + key < 32){
                    letter = (char)(letter + 32 - 126 - 1);
                }
                else{
                    letter = (char)(letter + key);
                }
            }
            c_cipher = c_cipher + letter;
        }

        return c_cipher;
    }

    public static void main(String[] args) throws IOException
    {
        try {


            int port = 8088;

            // Server Key
            int b = 15;/// It is

            // Client p, g, and key
            double clientP, clientG, clientA, B, Bdash;
            String Bstr;

            // Established the Connection
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            System.out.println("Just connected to " + server.getRemoteSocketAddress());

            // Server's Private Key
            System.out.println("From Server : Private Key = " + b);

            // Accepts the data from client
            DataInputStream in = new DataInputStream(server.getInputStream());

            clientP = Integer.parseInt(in.readUTF()); // to accept p
            System.out.println("From Client : P = " + (int)clientP);

            clientG = Integer.parseInt(in.readUTF()); // to accept g
            System.out.println("From Client : G = " + (int)clientG);

            clientA = Double.parseDouble(in.readUTF()); // to accept A
            System.out.println("From Client : Public Key = " + clientA);

            B = ((Math.pow(clientG, b)) % clientP); // calculation of B
            Bstr = Double.toString(B);

            // Sends data to client
            // Value of B
            OutputStream outToclient = server.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToclient);

            out.writeUTF(Bstr); // Sending B

            Bdash = ((Math.pow(clientA, b)) % clientP); // calculation of Bdash

            int ses_key = (int)Bdash;
            System.out.println("Secret Key to perform Symmetric Encryption = " + ses_key);
            String codeword = in.readUTF();
            System.out.println("Codeword: " + codeword);
            StringBuffer sb = new StringBuffer(ceasar_en(codeword, ses_key));
            String s_key = sb.toString();

            String mes = in.readUTF();
            mes = decrypt(mes, s_key);
            mes = "I have received '" + mes + "'.";
            System.out.println(mes);
            String mes_2 = encrypt(mes, s_key);
            out.writeUTF(mes_2);
            server.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}