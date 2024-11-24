package ch5;

import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.FlowLayout;

/*
<applet code="SwingAppletDemo.class" width="300" height="200">
</applet>
*/

public class SwingAppletDemo17 extends JApplet {
    public void init() {
        setLayout(new FlowLayout());

        // Create a JLabel and add it to the applet
        JLabel label = new JLabel("Hello from Swing Applet!");
        add(label);
    }
}

