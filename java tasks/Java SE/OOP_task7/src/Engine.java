public class Engine {
    public String name;
    public int cylinderAmount;
    public double cylinderVolume;
    public int weight;

    public Engine() {
    }

    public Engine(String name, int cylinderAmount, double cylinderVolume, int weight) {
        this.name = name;
        this.cylinderAmount = cylinderAmount;
        this.cylinderVolume = cylinderVolume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", cylinderAmount=" + cylinderAmount +
                ", cylinderVolume=" + cylinderVolume +
                ", weight=" + weight +
                '}';
    }
}
