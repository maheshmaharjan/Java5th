package ch2;

import java.awt.*;
import java.awt.event.*;

public class DialogDemo17 {
    public DialogDemo17() {
        // Create the main Frame
        Frame f = new Frame("Dialog Demo");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());

        // Create a modal Dialog with only a TextField
        Dialog d = new Dialog(f, "First Dialog", true);
        TextField t1 = new TextField(10);

        // Create another Dialog with only a Button
        Dialog d1 = new Dialog(f, "Second Dialog");
        Button b1 = new Button("Submit");

        // Create control buttons for the main Frame
        Button click = new Button("Open First Dialog");
        Button next = new Button("Open Second Dialog");

        // Add control buttons to the main Frame
        f.add(click);
        f.add(next);

        // ActionListener to show the first dialog (with TextField only)
        click.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.add(t1);
                d.setSize(200, 100);
                d.setLocationRelativeTo(null);
                d.setVisible(true);
            }
        });

        // ActionListener to show the second dialog (with Button only)
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d1.add(b1);
                d1.setSize(200, 100);
                d1.setLocationRelativeTo(null);
                d1.setVisible(true);
            }
        });

        // Handle closing of the dialogs
        d.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                d.dispose();
            }
        });

        d1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                d1.dispose();
            }
        });

        // Set Frame properties
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogDemo17();
    }
}
