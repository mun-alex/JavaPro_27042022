package kz.bitlab.pro.lesson8;

import kz.bitlab.pro.lesson8.models.Citizen;
import kz.bitlab.pro.lesson8.services.CitizensService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CitizensList extends JPanel {
    private MainFrame mainFrame;

    private JTextArea textArea;
    private JButton btnHome;

    public CitizensList(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        setSize(600, 800);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setSize(400, 400);
        textArea.setLocation(100, 100);

        btnHome = new JButton("ДОМОЙ");
        btnHome.setSize(200, 30);
        btnHome.setLocation(200, 520);

        add(textArea);
        add(btnHome);

        btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainFrame.getMainMenu().setVisible(true);
            }
        });
    }

    public void printData() {
        Citizen[] citizens = CitizensService.getAllCitizens();
        for (int i = 0; i < citizens.length; i++) {
            if (citizens[i] != null) textArea.append(citizens[i].getData() + "\n");
            else break;
        }
    }
}
