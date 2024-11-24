package ch5;

import javax.swing.*;
import java.awt.*;

public class JLabelCombinedDemo03 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JLabel with Resized Image and Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 1)); // Single component in the frame

        // Load Image Icon
        ImageIcon originalIcon = new ImageIcon("images/sample.jpg"); // Replace with your image path

        // Resize the image to desired dimensions (e.g., 50x50 pixels)
        Image scaledImage = originalIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        // JLabel with Image and Text
        JLabel imageAndTextLabel = new JLabel("This is an Image with Text", resizedIcon, JLabel.CENTER);
        
        imageAndTextLabel.setHorizontalTextPosition(SwingConstants.RIGHT); // Text to the right of the image
        imageAndTextLabel.setVerticalTextPosition(SwingConstants.CENTER);  // Centered vertically
        imageAndTextLabel.setFont(new Font("Tahoma", Font.PLAIN, 18)); // Set custom font

        // Add the JLabel to the frame
        frame.add(imageAndTextLabel);

        // Frame settings
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
