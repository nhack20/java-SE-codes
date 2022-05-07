package com.company;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public BankApplication() {
    }

    public BankApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        double max = 0;
        Account account = null;
        for (Account a : accounts) {
            if (max > a.getBalance()) {
                max = a.getBalance();
                account = a;
            }
        }
        return account;
    }

    public double getAverageBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum += accounts.get(i).getBalance();
        }
        return sum / accounts.size();
    }
    public double getTotalBalance(){
        double sum_balance = 0;
        for (int i=0; i<accounts.size(); i++){
            sum_balance+=accounts.get(i).getBalance();
        }
        return sum_balance;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    public String getBankData(){
        return "BankApplication{" +
                "name='" + name + '\'' +
                "accounts amount='" + accounts.size() + '\'' +
                "total balance='" + getTotalBalance() + '\'' +
                "average balance='" + getAverageBalance() + '\'' +
                '}';
    }
    }


