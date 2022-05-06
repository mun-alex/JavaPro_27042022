package kz.bitlab.pro.lesson3.HW;

public class PhoneMemory {
    private String name;
    private int totalMemory;
    private int price;

    public PhoneMemory() {
    }

    public PhoneMemory(String name, int totalMemory, int price) {
        this.name = name;
        this.totalMemory = totalMemory;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalMemory(int totalMemory) {
        this.totalMemory = totalMemory;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

