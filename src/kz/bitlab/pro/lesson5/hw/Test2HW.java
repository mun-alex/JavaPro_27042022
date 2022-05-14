package kz.bitlab.pro.lesson5.hw;

public class Test2HW {
    public static void main(String[] args) {
        SphereGold sphereGold1 = new SphereGold(23);
        SphereGold sphereGold2 = new SphereGold(12);
        SphereGold sphereGold3 = new SphereGold(41);

        CubeGold cubeGold1 = new CubeGold(4);
        CubeGold cubeGold2 = new CubeGold(5);
        CubeGold cubeGold3 = new CubeGold(6);

        GoldShape[] goldShapes = {
                sphereGold1,
                sphereGold2,
                sphereGold3,
                cubeGold1,
                cubeGold2,
                cubeGold3
        };

        for(GoldShape goldShape : goldShapes) {
            System.out.println(goldShape.getPrice());
        }
    }

}
