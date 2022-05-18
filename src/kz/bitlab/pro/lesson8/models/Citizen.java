package kz.bitlab.pro.lesson8.models;

public class Citizen {
    private int id;
    private String name;
    private String surname;
    private String city;
    private String iin;

    public Citizen() {
    }

    public Citizen(int id, String name, String surname, String city, String iin) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.iin = iin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getData() {
        return id + " " + name + " " + surname + " " + city + " " + iin;
    }
}
