package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        Account a1 = new Account(1, "Nursultan", "Aitkulov", 2500);
        Account a2 = new Account(2, "Aruzhan", "Adeas", 1200);
        Account a3 = new Account(1, "DDDa", "fsdgfdB", 71821100);
        Account a4 = new Account(2, "zxvcxq", "AAASAA", 223200);
        Account a5=new Account(1,"Dauren","Kapanov",132342);
        Account a6=new Account(2,"maksat","asads",12454565);
        ArrayList<Account>account1=new ArrayList<>();
        ArrayList<Account>account2=new ArrayList<>();
        ArrayList<Account>account3=new ArrayList<>();
        account1.add(a1);
        account1.add(a2);
        account2.add(a3);
        account2.add(a4);
        account3.add(a5);
        account3.add(a6);
        BankApplication b1=new BankApplication("Kaspi",account1);
        BankApplication b2=new BankApplication("Halyk",account2);
        ArrayList<BankApplication> allBanks=new ArrayList<>();
        allBanks.add(b1);
        allBanks.add(b2);
        for(int i=0; i<allBanks.size(); i++){
            for(int j=i; j<allBanks.size(); j++) {
                if (allBanks.get(i).getAverageBalance() < allBanks.get(j).getAverageBalance()) {
                    BankApplication temp = allBanks.get(i);
                    allBanks.set(i, allBanks.get(j));
                    allBanks.set(j, temp);
                }

            }

        }
        for (int i=0; i<allBanks.size(); i++) {
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}
    /*    ArrayList<Player> players = new ArrayList<>();
        Player p1 = new Player("Isco", 100000, 30);
        Player p2 = new Player("Messi ", 12300000, 35);
        Player p3 = new Player("Ronaldo", 744444, 37);
        Player p4 = new Player("Xavi", 10000, 41);
        Player p5 = new Player("Benzema", 203333, 34);
        Player p6 = new Player("Mbappe", 3000000, 23);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);

        int sum = 0, avg = 0, agv = 0, sum1 = 0,count=0;
        for (int i = 0; i < players.size(); i++) {
            sum += players.get(i).getPrice();
            sum1=players.get(i).getAge();
            avg=sum/players.size();
            agv=sum1/players.size();
            System.out.println(players.get(i));
        }
        System.out.println(avg);
        System.out.println(agv);
  *//*      System.out.println(sum/count);
        System.out.println(sum1/count);*/



