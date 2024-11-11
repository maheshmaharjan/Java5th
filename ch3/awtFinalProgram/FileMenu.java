package ch3.awtFinalProgram;

import java.awt.*;
import java.awt.event.*;

public class FileMenu {
    private Menu fileMenu;
    private AWTFinalProgram mainApp;

    public FileMenu(AWTFinalProgram app) {
        this.mainApp = app;
        fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem saveAsItem = new MenuItem("Save As");
        MenuItem exitItem = new MenuItem("Exit");

        // Add MenuItems to File Menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add ActionListener to Exit MenuItem
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainApp.updateStatus("Exiting the program...");
                System.exit(0);
            }
        });

        // Additional functionality for other menu items can be added here
    }

    public Menu getMenu() {
        return fileMenu;
    }
}

