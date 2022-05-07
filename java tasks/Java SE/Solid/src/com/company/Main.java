package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Shop> shopArrayList = new ArrayList<>();
        Shop shop = new Shop("KhanBarber", "Abaya123");
        shopArrayList.add(shop);
        List<Barber> barbersman = new ArrayList<>();
        Barber barber1 = new Barber("Yerzhan Abdikhalykov", "y@khanbaber.com", 87777777);
        Barber barber2 = new Barber("Aleksandr Ivanov", "oleg@khanbaber.com", 877745777);
        List<Barber> barberswoman = new ArrayList<>();
        Barber barberwoman1 = new Barber("Aidana Amanbayeva", "a@khanbarber@com", 874476);
        Barber barberwoman2 = new Barber("Tanya Ivanova", "tanya@khanbarber@com", 8584476);
        int size = 0;
        while (true) {
            System.out.println("PRESS [1] CHOICE GENDER");
            System.out.println("PRESS [2] SEE ORDER");
            System.out.println("PRESS [0] TO EXIT");
            String choice = in.next();
            if (choice.equals("1")) {
                System.out.println("Insert name");
                String name=in.next();
                System.out.println("Insert email");
                String email=in.next();
                System.out.println("Insert phone number");
                int phone=in.nextInt();
                System.out.println("Insert char");
                String gender=in.next();
                Client cl=new Client(name,email,phone,gender);
                ArrayList<Client>clients=readClients();
                clients.add(cl);
                saveClients(clients);
//                ManServices manServices=new ManServices();
//                ///ArrayList<Client> clientList=new List();
            }


        }


        }
    public static void saveClients(ArrayList<Client>clientList) {
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("clients.txt"));
        for (Client c : clientList) {
            bw.write(c.getName());
            bw.write(c.getEmail());
            bw.write(c.getPhone());
            bw.write(c.getGender());
        }
        bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Client> readClients() {
        ArrayList<Client> clientList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("clients.txt"));
            String line = "";
            while ((line = br.readLine()) != null) { //Первая линия всегда будет именем игрока
                String name = br.readLine();
                int phone=Integer.parseInt(br.readLine());
                clientList.add(new Client(line,name,phone));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            return clientList;
    }
}

