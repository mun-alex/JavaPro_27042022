package kz.bitlab.pro.lesson5.cw;

public class Coke extends Food{
    private double volumeLiters;
    private boolean isSparkling;

    public Coke() {

    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        this.name = name;
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) return volumeLiters * 400;
        else return volumeLiters * 100;
    }
}
