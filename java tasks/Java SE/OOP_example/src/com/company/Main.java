package com.company;

public class Main {

    public static void main(String[] args) {
        Programmers p1=new Programmers(12,"nhack27",100000,"male",1,"online",1.0);
        IT_specialists i1=new IT_specialists(1,43,"Nursultan Aitkulov",10000,12,"n@mail.ru","junior");
        HR h1=new HR(1,"Marzhan",30,140000,12,"healthy","marzhan@gmail.com");
        Teachers t1=new Teachers("242","Nadira",23,"female","n@iitu.edu.kz");
        t1.showEmail();
        System.out.println(p1.Value());
        i1.checkrole();
        System.out.println(h1.health());
        h1.candidate();
    }
}
