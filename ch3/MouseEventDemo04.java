package ch3;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo04 {

    private Frame f;
    private Label hl, ml, sl;
    private Panel p;

    public MouseEventDemo04() {
        f = new Frame("Java MouseEvent Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));

        hl = new Label("MouseListener", Label.CENTER);
        sl = new Label("Result", Label.CENTER);
        ml = new Label("Interact here to see event");
        p = new Panel();
        p.setLayout(new FlowLayout()); 
        
        f.add(hl);
        f.add(p);
        f.add(sl);
        ml.setAlignment(Label.CENTER);

        ml.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                sl.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
            }
            public void mousePressed(MouseEvent e) { }
            public void mouseReleased(MouseEvent e) { }
            public void mouseEntered(MouseEvent e) { }
            public void mouseExited(MouseEvent e) { }
        });

        p.add(ml);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventDemo04();
    }
}

