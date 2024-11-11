package ch3;

import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo07 {

    private Frame frame;
    private Button button;
    private Label label;

    public ActionEventDemo07() {
        // Create a frame
        frame = new Frame("ActionEvent Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create a button
        button = new Button("Click Me");
        label = new Label("Button not clicked yet.");

        // Add ActionListener to handle button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new ActionEvent using the constructor
                // you can omit this part
                ActionEvent actionEvent = new ActionEvent(e.getSource(), ActionEvent.ACTION_PERFORMED, "Button Clicked");
               
                // Update label when button is clicked
                label.setText("Button clicked with command: " + actionEvent.getActionCommand());
            }
        });

        // Add components to the frame
        frame.add(button);
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
        new ActionEventDemo07(); // Run the demo
    }
}

