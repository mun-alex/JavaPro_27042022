package kz.bitlab.pro.lesson4.hw;

public class Test3HW {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Gimnast("John", 18, "Kazakhstan",190, 85, "style");
        Sportsman sportsman2 = new Gimnast("Sarah", 19, "Germany",195, 75, "style");
        Sportsman sportsman3 = new Footballer("Rahat", 21, "Iran","Defender", "Zhetisu");
        Sportsman sportsman4 = new Footballer("Olzhas", 21, "Japan","Forward", "Ordabasy");
        Sportsman sportsman5 = new Swimmer("Dmitry", 22, "Kazakhstan", "bras", 22);
        Sportsman sportsman6 = new Swimmer("Olga", 18, "Kazakhstan", "style", 15);
        
        Sportsman[] sportsmen = new Sportsman[]{
                sportsman1,
                sportsman2,
                sportsman3,
                sportsman4,
                sportsman5,
                sportsman6
        };
        for (int i = 0; i < sportsmen.length; i++) {
            sportsmen[i].play();
        }

    }
}

class Sportsman {
    private String fullName;
    private int age;
    private String country;

    public Sportsman() {
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void play() {
        System.out.println("sportsman is playing!");
    }
}

class Gimnast extends Sportsman {
    private int height;
    private int weight;
    private String style;

    public Gimnast() {
    }

    public Gimnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getStyle() {
        return style;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void play() {
        System.out.println("gimnast is playing!");
    }
}

class Footballer extends Sportsman {
    private String position;
    private String club;

    public Footballer() {
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public void play() {
        System.out.println("footballer is playing");
    }
}

class Swimmer extends Sportsman {
    private String style;
    private double recordTime;

    public Swimmer() {
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public String getStyle() {
        return style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public void play() {
        System.out.println("swimmer is playing!");
    }
}

class OlympicGames {
    private String city;
    private int year;
    private Sportsman sportsmanList[];

    public OlympicGames() {
    }

    public OlympicGames(String city, int year, Sportsman[] sportsmanList) {
        this.city = city;
        this.year = year;
        this.sportsmanList = sportsmanList;
    }

    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public Sportsman[] getSportsmanList() {
        return sportsmanList;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSportsmanList(Sportsman[] sportsmanList) {
        this.sportsmanList = sportsmanList;
    }
}

