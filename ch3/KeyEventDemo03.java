package ch3;

import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo03 {
    private Frame frame;
    private Label headerLabel;
    private Label statusLabel;
    private TextField textField;

    public KeyEventDemo03() {
        frame = new Frame("AWT KeyEvent Example");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 1));

        headerLabel = new Label("Key Event Demo Program", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
        textField = new TextField(10);

        // Add key listener to the text field
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                statusLabel.setText("Entered text: " + textField.getText());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                statusLabel.setText("Released key: " + e.getKeyChar());
                // statusLabel.setText("Released key: " + e.getKeyCode());
                // statusLabel.setText("Released key: " + Character.toString(e.getKeyCode()));
            }

            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });

        // Create a panel for layout
        Panel panel = new Panel(new FlowLayout());
        panel.add(textField);

        // Add components to the frame
        frame.add(headerLabel);
        frame.add(panel);
        frame.add(statusLabel);

        // Set frame properties
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // Handle window closing
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new KeyEventDemo03();
    }
}
