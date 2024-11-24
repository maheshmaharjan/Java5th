package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextFieldDemo04 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JTextField Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLayout(new FlowLayout());

            // Create a JTextField
            JTextField textField = new JTextField(15); // 15 columns wide
            JLabel label = new JLabel("Enter your name:");

            // Add components to the frame
            frame.add(label);
            frame.add(textField);
            frame.setVisible(true);

            // Add an ActionListener to handle Enter key press
            textField.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = textField.getText();
                    JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
                    textField.setText(""); // Clear the text field after submission
                }
            });

        });
    }
}

