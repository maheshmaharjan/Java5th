package ch2;

import java.awt.*;
import java.awt.event.*;

public class LabelDemo01 {
    public LabelDemo01(){
        Frame f = new Frame("Frame");
        f.setSize(300, 300);
        Label firstLabel = new Label("This is the first Label", Label.RIGHT);
        f.add(firstLabel);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new LabelDemo01();
    }
}
