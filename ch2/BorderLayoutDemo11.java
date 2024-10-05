package ch2;

import java.awt.*;

public class BorderLayoutDemo11 {
    public BorderLayoutDemo11() {
        Frame f = new Frame("Layout Demo");
        f.setSize(400, 300); // Set window size
        f.setLayout(new BorderLayout(10, 15)); // BorderLayout with horizontal (10) and vertical (15) gaps

        // Creating buttons
        Panel p = new Panel();
        Button b2 = new Button("East");
        Button b3 = new Button("West");
        Button b4 = new Button("North");
        Button b5 = new Button("South");

        // Adding buttons to the respective regions
        f.add(p, BorderLayout.CENTER);
        f.add(b2, BorderLayout.EAST);
        f.add(b3, BorderLayout.WEST);
        f.add(b4, BorderLayout.NORTH);
        f.add(b5, BorderLayout.SOUTH);

        f.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new BorderLayoutDemo11();
    }
}

