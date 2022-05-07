public class Car {
    String name;
    String model;
    int speed;
    int weight;
    Engine engine;

    public Car() {
    }

    public Car(String name, String model, int speed, int weight, Engine engine) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.engine = engine;
    }

    public void ride(){
      System.out.println(model+"Car working "); ;

  }
  public int totalWeight(){
      int sum=weight+ engine.weight;
      return sum;
  }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", engine=" + engine +
                '}';
    }

}
