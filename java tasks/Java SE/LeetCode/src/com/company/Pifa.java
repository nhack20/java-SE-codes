package com.company;
import java.util.*;
public class Pifa {
    public static void main(String[] args) {
   /*Info<String> info1 = new Info<>("Lana");
        System.out.println(info1);
        String s = info1.getValue();*/
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("lana");
        al2.add("max");
        al2.add("dart");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);


    }
     static <T> T Getvalue(ArrayList<T> arrayList){
      return arrayList.stream().max(<T>)
    }
}

//        Info<Integer> info2 = new Info<>(21);
//        System.out.println(info2);
//        Integer i = info2.getValue();
//
//        Info<Double> info21 = new Info<>(3.14);
//        System.out.println(info21);
//        Double di = info21.getValue();
//
//        Bus<String > bus1=new Bus<>("Mercedes");
//        System.out.println(bus1);
//
//        /*Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b1 = info3.getValue();*/
//    }
//}
//
//class Info<T> {
//    private T value;
//
//    public Info(T value) {
//        this.value = value;
//    }
//
//    public String toString() {
//        return "{[" + value + "]}";
//    }
//
//    public T getValue() {
//        return value;
//    }
//}
//
//class Bus <Y>{
//    private Y model;
//
//    public Bus (Y model){
//        this.model=model;
//    }
//    public String toString(){
//        return "model =>"+model;
//    }
//    public Y getModel(){
//        return model;





//        Pifagor pifagor = new Pifagor() {
//            @Override
//            public int calculate(int x, int y) {
//                return (int) Math.sqrt(x * x + y * y);
//            }
//
//        };
//        Pifagor pifagor1;
//        pifagor1 = (x, y) -> (int) Math.sqrt(x * x + y * y);
//        System.out.println(pifagor1.calculate(8, 4));
//    }
//@FunctionalInterface
//interface Pifagor{
//    int calculate(int x, int y);

