package com.company;

public class WomanServices implements Makeup,Manicure{

    @Override
    public void makeupservice(int price, int quantity, int total) {
        price=2000;
        System.out.println(total=price*quantity);
    }

    @Override
    public void manicure(int price, int quantity, int total) {
        price=5000;
        System.out.println(total=price*quantity);

    }
}
