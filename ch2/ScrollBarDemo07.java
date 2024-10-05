package ch2;

// Example 2: Scrollbar with Adjustment Listener
import java.awt.*;
import java.awt.event.*;

public class ScrollBarDemo07 {

    public ScrollBarDemo07() {
        Frame f = new Frame("Scrollbar Example");
        final Label l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400, 100);
        
        final Scrollbar s = new Scrollbar();  // Default vertical scrollbar
        s.setBounds(100, 100, 50, 150);
        
        f.add(s);
        f.add(l);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("Vertical Scrollbar value is: " + s.getValue());
            }
        });
    }

    public static void main(String args[]) {
        new ScrollBarDemo07();
    }
}

