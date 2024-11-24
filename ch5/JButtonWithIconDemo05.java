package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonWithIconDemo05 {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        // Create the main frame
        JFrame frame = new JFrame("JButton with Icon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Load an image icon
        ImageIcon originalIcon = new ImageIcon("images/sample.jpg"); // Ensure the icon image path is correct

        // Resize the icon
        Image image = originalIcon.getImage(); // Get the original image
        Image resizedImage = image.getScaledInstance(32, 32, Image.SCALE_SMOOTH); // Resize to 32x32 pixels
        ImageIcon resizedIcon = new ImageIcon(resizedImage); // Create a new ImageIcon with the resized image

        // Create a JButton with the resized icon
        JButton iconButton = new JButton(resizedIcon);
        iconButton.setText("Click Me"); // Set text next to the icon
        iconButton.setHorizontalTextPosition(SwingConstants.RIGHT); // Text position relative to the icon

        // Add an ActionListener to handle button clicks
        iconButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Icon Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(iconButton);
        frame.setVisible(true);
    });
}
}

