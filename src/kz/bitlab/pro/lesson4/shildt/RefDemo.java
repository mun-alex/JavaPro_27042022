package kz.bitlab.pro.lesson4.shildt;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("weightBox volume = " + vol);
        System.out.println("weightBox weight = " + weightBox.weight);

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("plainBox volume = " + vol);


    }
}
