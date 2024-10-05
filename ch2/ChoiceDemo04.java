package ch2;

import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo04 {
    public ChoiceDemo04() {
        Frame f = new Frame("AWT CHOICE DEMO");
        f.setLayout(new GridLayout(1, 2));
        Label l1 = new Label("Which fruit you like most?");
        Choice c1 = new Choice();
        c1.add("apple");
        c1.add("banana");
        c1.add("grapes");
        f.add(l1);
        f.add(c1);

        System.out.println("currently selected is: " + c1.getSelectedItem());
        System.out.println("currently number of items in choice list is: " + c1.getItemCount());
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        c1.select(2);
        System.out.println("currently selected is: " + c1.getSelectedItem());

        c1.select("banana");
        System.out.println("currently selected is: " + c1.getSelectedItem());

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceDemo04();
    }
}

