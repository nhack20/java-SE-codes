public class Main {
    public static void main(String[] args) {
        int summa=0;
        Engine[] e = new Engine[3];
        e[0]= new Engine("DDD", 25, 36, 3);
        e[1]= new Engine("MM", 31, 23, 2);
        e[2]= new Engine("H", 15, 15, 5);

        Car[] c= new Car[6];
        c[0]= new Car("Toyota", "45", 180, 2, e[0]);
        c[1]= new Car("Mers", "200", 120, 27000, e[1]);
        c[2]= new Car("BMW", "X5", 190, 25000, e[2]);
        c[3]= new Car("Mercedes", "221", 180, 22000,e[2]);
        c[4]= new Car("Nexia", "LL20", 220, 27000, e[1]);
        c[5]= new Car("KIA", "K7", 120, 25000, e[0]);

        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        for(int i=0; i<c.length; i++){
            summa +=c[i].totalWeight();
        }
        System.out.println("Total summa->" +summa);
    }

}
