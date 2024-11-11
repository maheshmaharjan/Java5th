package ch3.awtFinalProgram;

import java.awt.*;
import java.awt.event.*;

public class AboutMenu {
    private Menu aboutMenu;
    private AWTFinalProgram mainApp;
    private Panel aboutPanel;

    public AboutMenu(AWTFinalProgram app) {
        this.mainApp = app;
        aboutMenu = new Menu("About");

        MenuItem aboutItem = new MenuItem("Go to About");
        aboutMenu.add(aboutItem);

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainApp.updateHeader("Welcome to About Page");
                mainApp.showAbout();
            }
        });

        // Initialize About Panel
        aboutPanel = new Panel();
        aboutPanel.setLayout(new FlowLayout());
        Label aboutLabel = new Label("Welcome to About Page");
        aboutPanel.add(aboutLabel);
        mainApp.addComponentToMainPanel(aboutPanel, "About");
    }

    public Menu getMenu() {
        return aboutMenu;
    }
}

