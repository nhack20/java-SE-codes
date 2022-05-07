import java.io.Serializable;

public class User implements Serializable {

    String name;
    String city;
    int age;

    public User(){

    }

    public User(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String toString(){
        return this.name + " " + this.age +  " years old from " + this.city;
    }

}