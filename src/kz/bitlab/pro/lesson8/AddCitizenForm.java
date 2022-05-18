package kz.bitlab.pro.lesson8;

import kz.bitlab.pro.lesson8.models.Citizen;
import kz.bitlab.pro.lesson8.services.CitizensService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCitizenForm extends JPanel {
    private MainFrame mainFrame;

    private JLabel labelCtzName;
    private JTextField textFieldCtzName;
    private JLabel labelCtzSurname;
    private JTextField textFieldCtzSurname;
    private JLabel labelCity;
    private JComboBox comboBoxCity;
    private JLabel labelIin;
    private JTextField textFieldIin;
    private JButton btnSubmit;
    private JButton btnHome;

    public AddCitizenForm(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        setSize(600, 800);
        setLayout(null);

        String[] cities = {
                "Алматы",
                "Караганда",
                "Павлодар",
                "Шымкент",
                "Кызылорда",
                "Нур-Султан",
                "Актобе",
                "Оскемен",
                "Семей",
                "Талдыкорган",
                "Кызылорда"
        };

        labelCtzName = new JLabel("Имя");
        labelCtzName.setSize(100, 30);
        labelCtzName.setLocation(90, 100);

        textFieldCtzName = new JTextField();
        textFieldCtzName.setSize(300, 30);
        textFieldCtzName.setLocation(210, 100);

        labelCtzSurname = new JLabel("Фамилия");
        labelCtzSurname.setSize(100, 30);
        labelCtzSurname.setLocation(90, 140);

        textFieldCtzSurname = new JTextField();
        textFieldCtzSurname.setSize(300, 30);
        textFieldCtzSurname.setLocation(210, 140);

        labelCity = new JLabel("Город");
        labelCity.setSize(100, 30);
        labelCity.setLocation(90, 180);

        comboBoxCity = new JComboBox(cities);
        comboBoxCity.setSize(300, 30);
        comboBoxCity.setLocation(210, 180);

        labelIin = new JLabel("ИИН");
        labelIin.setSize(100, 30);
        labelIin.setLocation(90, 220);

        textFieldIin = new JTextField();
        textFieldIin.setSize(300, 30);
        textFieldIin.setLocation(210, 220);

        btnSubmit = new JButton("ДОБАВИТЬ");
        btnSubmit.setSize(200, 30);
        btnSubmit.setLocation(90, 260);

        btnHome = new JButton("ДОМОЙ");
        btnHome.setSize(200, 30);
        btnHome.setLocation(310, 260);

        add(labelCtzName);
        add(textFieldCtzName);
        add(labelCtzSurname);
        add(textFieldCtzSurname);
        add(labelCity);
        add(comboBoxCity);
        add(labelIin);
        add(textFieldIin);
        add(btnSubmit);
        add(btnHome);

        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainFrame.getMainMenu().setVisible(true);
            }
        });

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Citizen citizen = new Citizen(
                        0,
                        textFieldCtzName.getText(),
                        textFieldCtzSurname.getText(),
                        comboBoxCity.getSelectedItem().toString(),
                        textFieldIin.getText()
                );

                CitizensService.addCitizen(citizen);

                textFieldCtzName.setText("");
                textFieldCtzSurname.setText("");
                comboBoxCity.setSelectedItem(0);
                textFieldIin.setText("");
            }
        });
    }
}
