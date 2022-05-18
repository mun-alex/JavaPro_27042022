package kz.bitlab.pro.lesson8;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenu;
    private AddCitizenForm addCitizenForm;
    private CitizensList citizensList;

    public MainFrame() {
        setSize(600, 800);
        setTitle("eGOV");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);

        addCitizenForm = new AddCitizenForm(this);
        addCitizenForm.setVisible(false);

        citizensList = new CitizensList(this);
        citizensList.setVisible(false);

        add(mainMenu);
        add(addCitizenForm);
        add(citizensList);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public AddCitizenForm getAddCitizenForm() {
        return addCitizenForm;
    }

    public CitizensList getCitizensList() {
        return citizensList;
    }
}
