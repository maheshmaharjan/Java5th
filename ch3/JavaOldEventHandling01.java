package ch3;

import java.awt.*;

public class JavaOldEventHandling01 extends Frame {
    public JavaOldEventHandling01() {
        Button b = new Button("Click Me");
        add(b);
        setTitle("Java 1.0 Event Handling Example");
        setSize(300, 200);
        setVisible(true);
    }

    // Handle events in Java 1.0 style
    public boolean handleEvent(Event e) {
         // Handle window closing event
         if (e.id == Event.WINDOW_DESTROY) {
            System.exit(0);
        }
        
        // Handle button click event
        if (e.target instanceof Button && e.id == Event.ACTION_EVENT) {
            System.out.println("Button clicked!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new JavaOldEventHandling01();
    }
}

