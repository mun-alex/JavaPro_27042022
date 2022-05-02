package kz.bitlab.pro.lesson2.HW;

public class TestHW {
    public static void main(String[] args) {
        //cw2
        Phone phone1 = new Phone("Name1", "Model1", 2000);
        Phone phone2 = new Phone("Name2", "Model2", 3000);
        Phone phone3 = new Phone("Name3", "Model3", 2000);
        Phone phone4 = new Phone("Name4", "Model4", 2000);
        Phone phone5 = new Phone("Name5", "Model5", 2000);
        phone1.getData();
        phone2.getData();
        phone3.getData();
        phone4.getData();
        phone5.getData();

        //cw3
        Phone[] phones = new Phone[5];
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        phones[3] = phone4;
        phones[4] = phone5;

        for (int i = 0; i < phones.length; i++) {
            phones[i].getData();
        }
    }
}
