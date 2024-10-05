package ch1;
// Create Frame by Extending Frame Class (Inheritance)

import java.awt.*;

public class FrameInheritance02 extends Frame {
    FrameInheritance02() {
        setSize(400, 300); // Set the size of the frame
        setTitle("Frame Using Inheritance"); // Set the title of the frame
        setVisible(true); // Make the frame visible
    }
    public static void main(String[] args) {
        new FrameInheritance02(); // Create an instance of the FrameInheritance class
    }
}

