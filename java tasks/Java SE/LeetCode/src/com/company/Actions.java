package com.company;

 interface Actions {
     default void eat() {
         System.out.println("Eating ");
    }
    static void sleep(){
        System.out.println("Sleep");
    };
}
