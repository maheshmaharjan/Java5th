package ch3.awtFinalProgram;

import java.awt.*;
import java.awt.event.*;

public class HomeMenu {
    private Menu homeMenu;
    private AWTFinalProgram mainApp;
    private Panel homePanel;

    public HomeMenu(AWTFinalProgram app) {
        this.mainApp = app;
        homeMenu = new Menu("Home");

        // Since Menu doesn't have addActionListener, use MenuShortcut or handle selection differently
        // AWT Menus don't support ActionListener directly, so using MenuItem as a workaround
        MenuItem homeItem = new MenuItem("Go to Home");
        homeMenu.add(homeItem);

        homeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainApp.updateHeader("Welcome to Home Page");
                mainApp.showHome();
            }
        });

        // Initialize Home Panel
        homePanel = new Panel();
        homePanel.setLayout(new FlowLayout());
        // Label homeLabel = new Label("Welcome to Home Page");
        // homePanel.add(homeLabel);
        mainApp.addComponentToMainPanel(homePanel, "Home");
    }

    public Menu getMenu() {
        return homeMenu;
    }
}
