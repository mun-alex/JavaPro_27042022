package kz.bitlab.pro.lesson6;

import kz.bitlab.pro.lesson5.cw.Burger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaloriesApp extends JFrame {

    public CaloriesApp() {
        setSize(600, 1000);
        setTitle("Calculate calories");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel labelBurgerName = new JLabel();
        labelBurgerName.setText("Наименование бургера");
        labelBurgerName.setSize(300, 30);
        labelBurgerName.setLocation(100, 100);

        JTextField textFieldBurgerName = new JTextField();
        textFieldBurgerName.setSize(300, 30);
        textFieldBurgerName.setLocation(100, 140);

        JLabel labelMeatAmount = new JLabel();
        labelMeatAmount.setText("Кол-во мяса (грамм)");
        labelMeatAmount.setSize(300, 30);
        labelMeatAmount.setLocation(100, 180);

        JTextField textFieldMeatAmount = new JTextField();
        textFieldMeatAmount.setSize(300, 30);
        textFieldMeatAmount.setLocation(100, 220);

        JLabel labelMeatType = new JLabel();
        labelMeatType.setText("Тип мяса (1-говядина, 2-курица)");
        labelMeatType.setSize(300, 30);
        labelMeatType.setLocation(100, 260);

        Integer[] meatTypes = new Integer[]{1, 2};
        JComboBox comboBoxMeatType = new JComboBox(meatTypes);
        comboBoxMeatType.setSize(300, 30);
        comboBoxMeatType.setLocation(100, 300);

//        JTextField textFieldMeatType = new JTextField();
//        textFieldMeatType.setSize(300, 30);
//        textFieldMeatType.setLocation(100, 300);

        JButton btnCalculate = new JButton();
        btnCalculate.setText("Calculate");
        btnCalculate.setSize(200, 30);
        btnCalculate.setLocation(150, 340);

        JLabel labelResult = new JLabel();
        labelResult.setSize(300, 30);
        labelResult.setLocation(100, 380);

        add(labelBurgerName);
        add(textFieldBurgerName);
        add(labelMeatAmount);
        add(textFieldMeatAmount);
        add(labelMeatType);
        add(comboBoxMeatType);
//        add(textFieldMeatType);
        add(btnCalculate);
        add(labelResult);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String burgerName = textFieldBurgerName.getText();
                int meatAmount = Integer.parseInt(textFieldMeatAmount.getText());
                int meatType = Integer.parseInt(comboBoxMeatType.getSelectedItem().toString());

                Burger burger = new Burger(burgerName, meatAmount, meatType);
                double result = burger.getCalories();
                labelResult.setText("Бургер " + burgerName + "содержит: " + result + " калорий");
            }
        });

    }
}
