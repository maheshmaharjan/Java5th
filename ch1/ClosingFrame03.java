package ch1;
// Closing Frame using WindowListnet

import java.awt.*;
import java.awt.event.*;

public class ClosingFrame03 {
    public static void main(String[] args) {
        Frame f = new Frame("Closing Frame Example"); 
        f.setSize(400, 300); 
        f.setVisible(true); 

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                f.setVisible(false); // Hides the frame window
                f.dispose(); // Release resource associated with the frame
            }
        });
    }
}

