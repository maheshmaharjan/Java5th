package ch1;
// Creating Frame by Creating Object of Frame Class (Association)

import java.awt.*;

public class FrameAssociation01 {
    public static void main(String[] args) {
        Frame f = new Frame(); // Create an object of the Frame class
        f.setSize(400, 300); // Set the size of the frame
        f.setTitle("Frame Using Association"); // Set the title of the frame
        f.setVisible(true); // Make the frame visible
    }
}
