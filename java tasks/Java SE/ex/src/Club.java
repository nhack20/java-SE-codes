import java.util.Arrays;

public class Club {
    public String name;
    public String country;
    public int ratingPoints;
    public Player[] players;

    public Club() {

    }

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {
        System.out.println("Club{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", ratingPoints=" + ratingPoints +
                ", players=" + Arrays.toString(players) +
                '}');
    }
}
