package kz.bitlab.pro.lesson5.cw;

public class Chocolate extends Food{

    private int weight;

    public Chocolate() {
    }

    public Chocolate(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return weight * 740;
    }
}
