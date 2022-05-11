package kz.bitlab.pro.lesson5;

public class Notebook {

    public static double actionPrice;
    private String brand;
    private String model;
    private double price;

    public Notebook() {
    }

    public Notebook(String brand, String model, double price) {
        String str = "hello";
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public static void getActionPrice() {
        int a = 0;
        System.out.println(actionPrice);
    }
}
