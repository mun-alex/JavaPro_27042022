package kz.bitlab.pro.lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    private MainFrame mainFrame;
    private JButton btnAddCitizen;
    private JButton btnGetAllCitizens;
    private JButton btnExit;

    public MainMenu(MainFrame mainFrame) {

        this.mainFrame = mainFrame;

        setSize(600, 800);
        setLayout(null);

        btnAddCitizen = new JButton("ДОБАВИТЬ ГРАЖДАНИНА");
        btnAddCitizen.setSize(200, 30);
        btnAddCitizen.setLocation(200, 200);

        btnGetAllCitizens = new JButton("СПИСОК ВСЕХ ГРАЖДАН");
        btnGetAllCitizens.setSize(200, 30);
        btnGetAllCitizens.setLocation(200, 250);

        btnExit = new JButton("ВЫХОД");
        btnExit.setSize(200, 30);
        btnExit.setLocation(200, 300);

        add(btnAddCitizen);
        add(btnGetAllCitizens);
        add(btnExit);

        btnAddCitizen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainFrame.getAddCitizenForm().setVisible(true);
            }
        });

        btnGetAllCitizens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainFrame.getCitizensList().setVisible(true);
                mainFrame.getCitizensList().printData();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
