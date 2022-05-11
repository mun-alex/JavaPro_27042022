package kz.bitlab.pro.lesson2.HW;

import java.util.Arrays;

public class TestHW7 {
    public static void main(String[] args) {
        Player player1 = new Player(12, "John", "Smith", "player");
        Player player2 = new Player(25, "Sarah", "Connor", "player");
        Player[] players = new Player[]{player1, player2};

        Club myClub = new Club("Ordabasy", "Kazakhstan", 100, players);
        myClub.printClubData();
    }
}

class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
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

class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

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