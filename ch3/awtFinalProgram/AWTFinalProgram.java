package ch3.awtFinalProgram;

import java.awt.*;
import java.awt.event.*;

public class AWTFinalProgram {
    private Frame frame;
    private Label headerLabel;
    private Panel mainPanel;
    private Label statusLabel;

    public AWTFinalProgram() {
        // Initialize Frame
        frame = new Frame("AWT Final Program");
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Initialize Labels
        headerLabel = new Label("Welcome to Home Page", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);

        // Initialize Main Panel
        mainPanel = new Panel();
        mainPanel.setLayout(new CardLayout());

        // Setup Menubar
        setupMenuBar();

        // Add components to Frame
        frame.add(headerLabel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);

        // Add WindowListener to handle window closing
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    private void setupMenuBar() {
        MenuBar menuBar = new MenuBar();

        // File Menu
        FileMenu fileMenu = new FileMenu(this);
        menuBar.add(fileMenu.getMenu());

        // Home Menu
        HomeMenu homeMenu = new HomeMenu(this);
        menuBar.add(homeMenu.getMenu());

        // About Menu
        AboutMenu aboutMenu = new AboutMenu(this);
        menuBar.add(aboutMenu.getMenu());

        // User Menu
        UserMenu userMenu = new UserMenu(this);
        menuBar.add(userMenu.getMenu());

        frame.setMenuBar(menuBar);
    }

    // Methods to switch content in mainPanel
    public void showHome() {
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "Home");
    }

    public void showAbout() {
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "About");
    }

    public void showUserForm() {
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel, "User");
    }

    public void addComponentToMainPanel(Component comp, String name) {
        mainPanel.add(comp, name);
    }

    public void updateStatus(String message) {
        statusLabel.setText(message);
    }

    public void updateHeader(String message) {
        headerLabel.setText(message);
    }

    public static void main(String[] args) {
        new AWTFinalProgram();
    }
}
