package ch3;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo05 extends Frame implements MouseListener {
    private int x = 0, y = 0;
    private String eventDescription = "";

    public MouseEventDemo05(String title) {
        super(title);
        setupFrame();
    }

    private void setupFrame() {
        // Set up window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Exit the application
            }
        });

        // Set up mouse listener
        addMouseListener(this);

        // Frame settings
        setSize(500, 300);
        setVisible(true);
    }

    // Common method to update event information
    private void updateEventInfo(String event, MouseEvent e) {
        eventDescription = event;
        System.out.println(eventDescription);
        x = e.getX();
        y = e.getY();
        repaint(); // Request a redraw
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        updateEventInfo("Mouse Clicked", e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        updateEventInfo("Mouse Pressed", e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        updateEventInfo("Mouse Released", e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        updateEventInfo("Mouse Entered", e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        updateEventInfo("Mouse Exited", e);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(eventDescription + " at (" + x + ", " + y + ")", 50, 50);
    }

    public static void main(String[] args) {
        new MouseEventDemo05("Mouse Events Example");
    }
}

