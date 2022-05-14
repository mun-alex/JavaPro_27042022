package kz.bitlab.pro.lesson5.hw;

public class SphereGold extends GoldShape {
    private double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * 3.14 * (radius * radius * radius);
    }
}
