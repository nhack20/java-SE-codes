import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player[] p1 = new Player[3];
        p1[0] = new Player(1, "Nursultan", "Aitkulov", "goalkeeper");
        p1[1] = new Player(23, "Dauren", "Kapanov", "defender");
        p1[2] = new Player(2, "Andrei", "Arshavin", "forward");
        Player[] p2 = new Player[3];
        p2[0] = new Player(99, "Andrei", "Despotovich", "goalkeeper");
        p2[1] = new Player(4, "Oraz", "Nurbekov", "defender");
        p2[2] = new Player(32, "Higuta", "Luis", "forward");
        Club c1 = new Club("Kairat", "Almaty", 3, p1);
        Club c2 = new Club("Astana", "Nur-Sultan", 4, p2);
        Club[] league = {c1, c2};
        Player[] p3 = sortPlayers(p1);
        for (int i = 0; i < p3.length; i++) {
            System.out.println(p3[i]);
        }
        Player[] p4 = sortPlayers(p2);
        for (int i = 0; i < p4.length; i++) {
            System.out.println(p4[i]);
        }
        Club[] c5 = sortClub(league);
        for (int i = 0; i < c5.length; i++) {
            c5[i].printClubData();
        }

    }

    public static Player[] sortPlayers(Player[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i].number > players[i + 1].number) {
                Player temp = players[i];
                players[i] = players[i + 1];
                players[i + 1] = temp;
            }
        }
        return players;
    }

    public static Club[] sortClub(Club[] club) {
        for (int i = 0; i < club.length - 1; i++) {
            if (club[i].ratingPoints > club[i + 1].ratingPoints) {
                Club temp = club[i];
                club[i] = club[i + 1];
                club[i + 1] = temp;
            }
        }
        return club;
    }
}

