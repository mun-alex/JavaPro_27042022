package kz.bitlab.pro.lesson4.shildt;

public class Shildt {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = myBox1.volume();
        vol = myBox2.volume();


    }
}
