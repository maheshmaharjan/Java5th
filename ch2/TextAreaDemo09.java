package ch2;

import java.awt.*;

public class TextAreaDemo09 extends Frame {
    public TextAreaDemo09() {
        setSize(400, 400);
        setLayout(new GridLayout(3, 2));

        // Creating TextArea objects with different constructors
        TextArea ta1 = new TextArea(); // Default TextArea
        TextArea ta2 = new TextArea("put ur suggestion"); // TextArea with initial text
        TextArea ta3 = new TextArea("Please put ur comment", 4, 4, TextArea.SCROLLBARS_NONE); // No scroll bars
        TextArea ta4 = new TextArea("Please put ur suggestion", 6, 9, TextArea.SCROLLBARS_HORIZONTAL_ONLY); // Horizontal scroll bar only

        // Adding labels for TextArea fields
        Label comment = new Label("Comment");
        Label suggestion = new Label("Suggestion");

        // Adding components to the Frame
        add(comment);
        add(ta1);
        add(suggestion);
        add(ta2);
        add(ta3);
        add(ta4);

        // Making the Frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaDemo09(); // Running the demo
    }
}
