package kz.bitlab.pro.lesson4.shildt;

public class BoxWeight extends Box {
    double weight;

//    BoxWeight(double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
//        weight = m;
//    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}
