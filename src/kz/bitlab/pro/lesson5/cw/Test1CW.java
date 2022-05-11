package kz.bitlab.pro.lesson5.cw;

public class Test1CW {
    public static void main(String[] args) {
        Chocolate snickers = new Chocolate("snickers", 250);
        Chocolate twix = new Chocolate("twix", 200);

        Burger burgerKing = new Burger("Burger King", 2, 1);
        Burger mcDonalds = new Burger("MC Donald's", 3, 2);

        Coke coca = new Coke("Coca Cola", 0.5, true);
        Coke fuseTea = new Coke("Fuse Tea", 0.5, false);

        Food[] foods = new Food[]{
                snickers,
                twix,
                burgerKing,
                mcDonalds,
                coca,
                fuseTea
        };

        for (int i = 0; i < foods.length; i++) {
            System.out.print(foods[i].name + " ");
            System.out.println(foods[i].getCalories());
        }
    }
}
