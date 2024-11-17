package ch4;

import javax.swing.*;
import java.awt.*;

public class PluggableLookAndFeelExample {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Pluggable Look-and-Feel Example");

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Create a button
        JButton button = new JButton("Click Me");

        // Add the button to the frame
        frame.add(button);

        // Set frame size and close operation
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);

        // Switch look-and-feel to Windows style
        SwingUtilities.invokeLater(() -> {
            try {
                // Change to Windows look-and-feel
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                // Update the UI to reflect the change
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

