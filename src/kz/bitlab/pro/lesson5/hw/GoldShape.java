package kz.bitlab.pro.lesson5.hw;

public abstract class GoldShape {
    public abstract double getVolume();
    public double getPrice() {
        return getVolume() * 250 + 1200;
    }
}
