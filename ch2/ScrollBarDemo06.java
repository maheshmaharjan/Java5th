package ch2;

// Example 1: Basic Scrollbar Demo

import java.awt.*;

public class ScrollBarDemo06 {

    public ScrollBarDemo06() {
        Frame f = new Frame("Java Scrollbar Examples");
        
        Scrollbar vsb = new Scrollbar(Scrollbar.VERTICAL, 100, 5, 100, 200);  // Vertical Scrollbar
        Scrollbar hsb = new Scrollbar(Scrollbar.HORIZONTAL);  // Horizontal Scrollbar
        hsb.setValues(150, 10, 100, 200);
        
        System.out.println("Current horizontal scrollbar value: " + hsb.getValue());
        System.out.println("Current vertical scrollbar value: " + vsb.getValue());

        Panel p = new Panel();
        p.setLayout(null);
        
        // Setting bounds for positioning scroll bars
        vsb.setBounds(100, 100, 50, 300);
        hsb.setBounds(200, 100, 350, 50);
        
        p.add(hsb);
        p.add(vsb);
        
        f.add(p);
        f.setSize(900, 600);
        f.setLocationRelativeTo(null);  // Centers the window
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollBarDemo06();
    }
}
