package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JToggleButtonDemo07 {
    public JToggleButtonDemo07() {
        JFrame frame = new JFrame("JToggleButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        
        JLabel label = new JLabel("Button is off");
        JToggleButton toggleButton = new JToggleButton("On/Off");

        frame.add(toggleButton);
        frame.add(label);
        frame.setVisible(true);
        
        // Add an ItemListener to handle state changes
        toggleButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // Update the label based on the button's state
                if (toggleButton.isSelected()) {
                    label.setText("Button is on");
                } else {
                    label.setText("Button is off");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JToggleButtonDemo07::new);
    }
}

