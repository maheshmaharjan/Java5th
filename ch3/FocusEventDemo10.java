package ch3;

import java.awt.*;
import java.awt.event.*;

public class FocusEventDemo10 implements FocusListener {

    private Frame frame;
    private TextField textField1;
    private TextArea textArea1;
    private Label label, label1;

    public FocusEventDemo10() {
        // Create a frame
        frame = new Frame("FocusEvent Example");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));

        // Create text fields
        textField1 = new TextField("Click here");
        textArea1 = new TextArea("Or here");

        // Add FocusListener to the text fields
        textField1.addFocusListener(this);
        textArea1.addFocusListener(this);

        // Create a label to show focus changes
        label = new Label("Focus events will appear here.", Label.CENTER);
        label1 = new Label("Focus events will appear here.", Label.CENTER);
        
        // Add components to frame
        frame.add(textField1);
        frame.add(textArea1);
        frame.add(label);
        frame.add(label1);

        // Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true); // Show the frame
    }

    // FocusListener method to handle when focus is gained
    @Override
    public void focusGained(FocusEvent e) {
        label.setText(e.getComponent().getClass().getName() + " gained focus.");
    }

    // FocusListener method to handle when focus is lost
    @Override
    public void focusLost(FocusEvent e) {
        label1.setText(e.getComponent().getClass().getName() + " lost focus.");
    }

    public static void main(String[] args) {
        new FocusEventDemo10(); // Run the demo
    }
}

