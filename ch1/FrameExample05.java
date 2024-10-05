package ch1;
// Create a simple Java AWT application that uses a Frame to create a window with a title bar. The window should contain a button that, when clicked, displays a message dialog with a greeting.

import java.awt.*;
import java.awt.event.*;

public class FrameExample05 {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame Example");

        frame.setSize(300,300);
        frame.setLayout(null); // No Layout Manager
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        Button button = new Button("Click Me");
        button.setBounds(30, 50, 80, 30); // setting button position
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Dialog dialog = new Dialog(frame,"Greeting", true);
                dialog.setLayout(new FlowLayout());

                dialog.add(new Label("Hello, Welcome to AWT"));
                
                Button closeButton = new Button("Close");
                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        dialog.dispose();
                    }
                });

                dialog.add(closeButton);
                dialog.setSize(200, 100);
                dialog.setLocationRelativeTo(frame); // Center the dialog
                dialog.setVisible(true);
            }
        });

        
    }
}
