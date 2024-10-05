package ch2;

import java.awt.*;
import java.awt.event.*;

public class ListDemo05 {
    public ListDemo05() {
        Frame f = new Frame("AWT LIST DEMO");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        List lst = new List(2, false);
        lst.add("java");
        lst.add("C programming");
        lst.add("web Technology");
        lst.add("python");
        lst.add("Ruby");
        lst.add("JavaScript");
        lst.add("Object Oriented");
        lst.add("Dot Net");
        lst.add("Networking", 2);
        lst.add("AJAX", 7);

        lst.select(0);
        System.out.println("currently selected is: " + lst.getSelectedItem());

        lst.select(4);
        System.out.println("currently selected is: " + lst.getSelectedItem());
        
        String[] s = lst.getSelectedItems();
        for (String z : s) {
            System.out.println(z);
        }
        System.out.println("item is: " + lst.getItem(5));

        Panel p = new Panel(new FlowLayout());
        p.add(lst);
        f.add(p);       
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ListDemo05();
    }
}

