package ch3;

import java.awt.*;
import java.awt.event.*;

public class TextEventDemo05 {

    private Frame f;
    private Label hl, sl;
    private Panel p;
    private TextField t;

    public TextEventDemo05() {
        f = new Frame("Java TextEvent Handling Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));

        hl = new Label("TextListener in Action", Label.CENTER);
        sl = new Label("", Label.CENTER);

        p = new Panel();
        p.setLayout(new FlowLayout());

        // Add components to the frame
        f.add(hl);
        f.add(p);
        f.add(sl);
        f.setVisible(true);

        // Initialize text field and add text listener
        t = new TextField(10);
        t.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                sl.setText("Entered text: " + t.getText());
            }
        });
        p.add(t);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TextEventDemo05();
    }
}

