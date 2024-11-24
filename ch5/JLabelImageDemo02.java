package ch5;

import java.awt.*;
import javax.swing.*;
import java.net.URL;

public class JLabelImageDemo02 {
    public JLabelImageDemo02() {
        JFrame frame = new JFrame("JLabel Image Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Attempt to load the image from the resources
        ImageIcon imageIcon = createImageIcon("images/sample.jpg", "Sample Image");
        
        // JLabel with Image Only
        JLabel imageLabel;
        if (imageIcon != null) {
            // Create a JLabel with the image icon
            imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center alignment
        } else {
            // Fallback: Display an error message if image not found
            imageLabel = new JLabel("Image not found.");
            imageLabel.setForeground(Color.RED);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        // Add padding around the label
        imageLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Add the label to the frame's content pane
        frame.getContentPane().add(imageLabel, BorderLayout.CENTER); //Starting with Java 5, JFrame.add(...) is syntactic sugar that delegates the call to the contentPane. So, when you call frame.add(...), it is equivalent to frame.getContentPane().add(...). So you can use frame.add(...)
        
        // Adjust frame size based on content
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setVisible(true);
    }
    
    /** 
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected ImageIcon createImageIcon(String path, String description) {
        URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    public static void main(String[] args) {
        // Ensure GUI creation runs on the Event Dispatch Thread
        SwingUtilities.invokeLater(JLabelImageDemo02::new);
    }
}

