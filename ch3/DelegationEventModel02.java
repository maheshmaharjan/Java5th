package ch3;

import java.awt.*;
import java.awt.event.*;

public class DelegationEventModel02 extends Frame implements ActionListener {
    Button b;

    public DelegationEventModel02() {
        b = new Button("Click Me");
        b.addActionListener(this); // Register the listener for the button
        add(b);
        setSize(300, 200);
        setVisible(true);
    }

    // Handle the button click event
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked in the new event model!");
    }

    public static void main(String[] args) {
        new DelegationEventModel02();
    }
}

