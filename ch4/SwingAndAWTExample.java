package ch4;

import javax.swing.*;  // Importing Swing package for GUI components
import java.awt.*;      // Importing AWT package for layout managers

public class SwingAndAWTExample {
    public static void main(String[] args) {
        // Create a JFrame (Swing component) to represent the main window
        JFrame frame = new JFrame("Swing Built on AWT Example");

        // Setting the layout to AWT's BorderLayout (AWT component)
        frame.setLayout(new BorderLayout());

        // Create a JButton (Swing component) and add it to the frame
        JButton button = new JButton("Click Me"); // Swing component
        frame.add(button, BorderLayout.CENTER); // Add button to center using AWT layout manager

        // Set some basic properties of the JFrame
        frame.setSize(400, 300);   // Set size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close application when window is closed

        // Make the window visible
        frame.setVisible(true);
    }
}
