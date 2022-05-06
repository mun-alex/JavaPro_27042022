package kz.bitlab.pro.lesson3.HW;

public class PhoneProcessor {
    private String name;
    private int ram;
    private int price;

    public PhoneProcessor() {
    }

    public PhoneProcessor(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
