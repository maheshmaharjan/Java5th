package ch4;

import javax.swing.*;
import java.awt.*;

public class DefaultLookAndFeelExample {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Default Look-and-Feel Example");

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
    }
}
