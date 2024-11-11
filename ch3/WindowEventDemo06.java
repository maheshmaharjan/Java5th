package ch3;

import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo06 {

    private Frame frame;

    public WindowEventDemo06() {
        // Create a frame
        frame = new Frame("Window Event Handling Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Add window listener to handle various window events
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                frame.dispose(); // Dispose of the frame to close it
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }
        });

        // Create a button to demonstrate window state transitions
        Button button = new Button("Minimize Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setState(Frame.ICONIFIED); // Minimize the window
            }
        });

        // Add components to the frame
        frame.add(button);
        frame.add(new Label("Perform actions on this window."));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowEventDemo06();
    }
}
