package ch3;

import java.awt.*;
import java.awt.event.*;

public class AdjustmentEventDemo08 {

    private Frame frame;
    private Scrollbar scrollbar;
    private Label label;

    public AdjustmentEventDemo08() {
        // Create a frame
        frame = new Frame("AdjustmentEvent Example");
        frame.setSize(600, 150);
        frame.setLayout(new FlowLayout());

        // Create a scrollbar
        scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        scrollbar.setPreferredSize(new Dimension(300, 20)); // Width = 300, Height = 20
        label = new Label("Scroll value: 0");

        // Add AdjustmentListener to the scrollbar
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Update the label with the current value of the scrollbar
                label.setText("Scroll value: " + e.getValue());
            }
        });

        // Add components to the frame
        frame.add(scrollbar);
        frame.add(label);

        // Add window listener to handle window closing
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Close the frame
            }
        });

        // Set frame to be visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustmentEventDemo08(); // Run the demo
    }
}
