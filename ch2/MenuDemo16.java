package ch2;

import java.awt.*;
import java.awt.event.*;

public class MenuDemo16 {
    public MenuDemo16() {
        // Create a Frame
        Frame f = new Frame("Dashboard");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());

        // Create a MenuBar
        MenuBar menubar = new MenuBar();

        // Create Menus
        Menu fileMenu = new Menu("File", true);    // Removable menu
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Add Menus to MenuBar
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);

        // Set MenuBar to Frame
        f.setMenuBar(menubar);

        // Create MenuItems for File Menu
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        MenuItem saveFile = new MenuItem("Save");
        MenuItem saveAsFile = new MenuItem("Save As");
        MenuItem exitItem = new MenuItem("Exit");

        // Create CheckboxMenuItems for File Menu
        CheckboxMenuItem check1 = new CheckboxMenuItem("Check 1", true);
        CheckboxMenuItem check2 = new CheckboxMenuItem("Check 2");

        // Add MenuItems to File Menu
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(saveAsFile);
        fileMenu.add(exitItem);
        fileMenu.add(check1);
        fileMenu.add(check2);

        // Disable "Save As" MenuItem
        saveAsFile.setEnabled(false);

        // Add ActionListener to Exit MenuItem
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Exit the application
            }
        });

        // Add WindowListener to handle window close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });

        // Set Frame Location to Center and Make Visible
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo16();  // Run the MenuDemo
    }
}
