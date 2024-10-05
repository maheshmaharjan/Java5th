package ch2;

import java.awt.*;

public class GridLayoutDemo12 {
    public GridLayoutDemo12() {
        Frame f = new Frame("GridLayout Demo");
        f.setSize(400, 300); // Set window size

        // Create a GridLayout with 3 rows, 2 columns, 10px horizontal and 15px vertical gaps
        f.setLayout(new GridLayout(3, 2, 10, 15)); 

        // Adding components to grid cells
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Button b6 = new Button("Button 6");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        f.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new GridLayoutDemo12();
    }
}

