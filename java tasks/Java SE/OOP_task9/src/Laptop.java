import java.util.Arrays;

public class Laptop {
    public String name;
    public int price;
    public int weight;
    HDD hardDiskDrive;
    CPU[] cpuMemory;

    public Laptop() {
    }

    public Laptop(String name, int price, int weight, HDD hardDiskDrive, CPU[] cpuMemory) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDrive = hardDiskDrive;
        this.cpuMemory = cpuMemory;
    }

    public int getTotalPrice(){
      int sum=0;
      for(int i=0;i<cpuMemory.length;i++){
          sum+=cpuMemory[i].price;
      }
      return sum+price+hardDiskDrive.price;
    }
    public int getTotalCPUMemory(){
        int sum=0;
        for(int i=0;i<cpuMemory.length;i++){

            sum+=cpuMemory[i].cashMemory;
        }
        return sum;
    }
    public int getTotalWeight(){
        int sum1=0;
        for(int i=0;i<cpuMemory.length;i++){
            sum1+=cpuMemory[i].weight;
        }
        return sum1+weight+hardDiskDrive.weight;

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", hardDiskDrive=" + hardDiskDrive +
                ", cpuMemory=" + Arrays.toString(cpuMemory) +
                '}';
    }
}

