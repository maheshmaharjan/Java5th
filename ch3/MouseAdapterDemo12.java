package ch3;

import java.awt.*;
import java.awt.event.*;

public class MouseAdapterDemo12 extends Frame {
    String message = "Mouse events will be shown here";

    MouseAdapterDemo12(String title) {
        super(title);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Use MouseAdapter to handle mouse events
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                message = "Mouse Pressed at: " + e.getX() + ", " + e.getY();
                repaint();
            }
        });

        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }

    public static void main(String[] args) {
        new MouseAdapterDemo12("Mouse Adapter Example");
    }
}

