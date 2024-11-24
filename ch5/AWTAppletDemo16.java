package ch5;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="AWTAppletDemo.class" width="300" height="200">
</applet>
*/

public class AWTAppletDemo16 extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello from AWT Applet!", 50, 100);
    }
}

