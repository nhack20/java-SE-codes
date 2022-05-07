package com.company;

public class Main {

    public static void main(String[] args) {
        FerrariEngine f1 = new FerrariEngine(3.0, 2, 3.2);
        FerrariEngine f2 = new FerrariEngine(3.1, 3, 3.5);
        FerrariEngine f3 = new FerrariEngine(4.1, 4, 3.7);
        FerrariEngine f4 = new FerrariEngine(3.5, 6, 4.5);
        FerrariEngine f5 = new FerrariEngine(3.9, 8, 6);

        RenaultEnigine r1=new RenaultEnigine(2.3,3,1.2,3);
        RenaultEnigine r2=new RenaultEnigine(2.1,2,1.4,2);
        RenaultEnigine r3=new RenaultEnigine(1.3,5,2.2,5);
        RenaultEnigine r4=new RenaultEnigine(2.9,6,3.2,9);
        RenaultEnigine r5=new RenaultEnigine(0.3,8,6.2,10);

        f1.getEngineWeight();
        f1.efficiency();
        Engine engine[]={f1,f2,f3,f4,f5};
        for(int i=0;i<engine.length;i++){
            engine[i].getEngineWeight();
        }


    }
}
