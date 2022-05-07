public class Main {
    public static void main(String[] args) {
        CPU[] c1 = new CPU[2];
        c1[0] = new CPU(3, 12000, 5);
        c1[1] = new CPU(2, 15000, 4);
        HDD[] h1 = new HDD[2];
        h1[0]= new HDD(3, 5000, 5);
        h1[1]= new HDD(1, 2000, 3);
        Laptop[] l1 = new Laptop[4];
        l1[0]= new Laptop("Acer", 2000000, 3, h1[0], c1);
        l1[1] = new Laptop("Mac", 120000, 4, h1[1], c1);
        l1[2]= new Laptop("Asus", 54540000, 3, h1[0], c1);
        l1[3] = new Laptop("HP", 70000, 4, h1[1], c1);
        for(int i=0; i<l1.length; i++){
            System.out.println(l1[i].getTotalPrice());
        }
        for(int i=0; i<l1.length; i++){
            System.out.println(l1[i].getTotalCPUMemory());
        }
        for(int i=0; i<l1.length; i++){
            System.out.println(l1[i].getTotalWeight());
        }
        for (int i=0;i<l1.length;i++){
            System.out.println(l1[i]);
        }
    }
    }

