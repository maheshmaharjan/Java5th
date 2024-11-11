package ch3;

import java.awt.*;
import java.awt.event.*;

public class InnerClassEventHandling13 {

    private Frame frame;
    private Label statusLabel;
    private TextField textField;

    public InnerClassEventHandling13() {
        frame = new Frame("AWT Inner Class Example");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(2, 1));
        
        textField = new TextField(10);
        statusLabel = new Label("");
            
        frame.add(textField);
        frame.add(statusLabel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Add the custom key listener
        textField.addKeyListener(new CustomKeyListener());
    }

    public static void main(String[] args) {
        new InnerClassEventHandling13();
    }

    // Inner class for handling key events
    class CustomKeyListener implements KeyListener {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                statusLabel.setText("Entered text: " + textField.getText());
            }
        }

        public void keyTyped(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
    }
}

