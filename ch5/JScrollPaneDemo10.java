package ch5;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo10 extends JFrame {
    public JScrollPaneDemo10() {
        setTitle("JScrollPane Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null); // Center the frame

        // Create a JPanel with a GridLayout to hold multiple buttons
        JPanel buttonPanel = new JPanel(new GridLayout(20, 20, 5, 5)); // 20x20 grid with 5px gaps
        int buttonCount = 0;

        // Add 400 buttons to the panel
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                JButton button = new JButton("Button " + buttonCount++);
                buttonPanel.add(button);
            }
        }

        // Create a JScrollPane, adding the button panel to it
        JScrollPane scrollPane = new JScrollPane(buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(380, 380)); // Set preferred size for better layout

        // Add the scroll pane to the frame
        add(scrollPane);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new JScrollPaneDemo10());
    }
}

