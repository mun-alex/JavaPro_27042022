package kz.bitlab.pro.lesson5.cw;

public class Burger extends Food {
    private int meatAmount;
    private int meatType;

    public Burger() {

    }

    public Burger(String name, int meatAmount, int meatType) {
        this.name = name;
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public int getMeatAmount() {
        return meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        switch (meatType) {
            case 1: return meatAmount * 840;
            case 2: return meatAmount * 560;
            default: return 0;
        }
    }
}
