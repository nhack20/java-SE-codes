import java.util.Locale;

public class Player {
    public int number;
    public String name;
    public String surname;
    public String position;

    public Player() {

    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String getFio(){
        return name.toUpperCase(Locale.ROOT) + " " + surname;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
