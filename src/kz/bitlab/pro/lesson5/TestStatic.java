package kz.bitlab.pro.lesson5;

public class TestStatic {
    public static void main(String[] args) {
        Notebook thinkPad = new Notebook("Lenovo", "ThinkPad", 2300);
        Notebook apple = new Notebook("apple", "airbook", 3300);
        Notebook.actionPrice = 1000;
        Notebook.getActionPrice();
    }
}
