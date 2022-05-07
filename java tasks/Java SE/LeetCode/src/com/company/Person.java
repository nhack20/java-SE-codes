package com.company;

 class Person implements Actions{


     @Override
     public void eat() {
         System.out.println("Person eating");
     }

     public static void main(String[] args) {
         Person p1=new Person();
         p1.eat();
     }
 }

